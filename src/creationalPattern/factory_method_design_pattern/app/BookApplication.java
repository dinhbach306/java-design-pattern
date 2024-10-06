package creationalPattern.factory_method_design_pattern.app;

import creationalPattern.factory_method_design_pattern.connection.IConnectionFactory;
import creationalPattern.factory_method_design_pattern.connection.ConnectionFactoryImpl;
import creationalPattern.factory_method_design_pattern.dbCtx.DatabaseContextImpl;
import creationalPattern.factory_method_design_pattern.dbCtx.IDatabaseContext;

public final class BookApplication {
	//Hàm getter trả về đối tượng ConnectionFactory
	public IConnectionFactory getConnectionFactory() {
		return connectionFactory;
	}

	private final IConnectionFactory connectionFactory;

	public IDatabaseContext getDatabaseCtx() {
		return databaseCtx;
	}

	private final IDatabaseContext databaseCtx;

	private static final BookApplication INSTANCE = new BookApplication();

	private BookApplication() {
		databaseCtx = new DatabaseContextImpl();
		connectionFactory = new ConnectionFactoryImpl();
	}

	public static BookApplication getInstance() {
		return INSTANCE;
	}
}
