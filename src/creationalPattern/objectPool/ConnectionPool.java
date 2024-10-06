package creationalPattern.objectPool;

import java.sql.Connection;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ConnectionPool {
	private static final int MAX_POOL_SIZE = 16;

	// Tạo ra một hàng đợi chứa các connection
	private final LinkedBlockingQueue<Connection>
			connectionQueue = new LinkedBlockingQueue<>();

	// Cung cấp làm việc an toàn với integer trong môi trường đa luồng
	// Không cần dùng synchronized
	private final AtomicInteger numberOfCreatedConnections = new AtomicInteger(0);

	public Connection provide() throws Exception {
		synchronized (this) {
			if (numberOfCreatedConnections.get() < MAX_POOL_SIZE) {
				// Tăng số lượng kết nối và tạo kết nối mới
				numberOfCreatedConnections.incrementAndGet();
				final Connection connection = (Connection) new ConnectionPool();
				return connection;
			}
		}
		return connectionQueue.take();
	}


	// Thu hồi connection lại
	public void pushBack(Connection connection) {
		connectionQueue.offer(connection);
	}
}
