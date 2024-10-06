package creationalPattern.factory_method_design_pattern.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactoryImpl implements IConnectionFactory {
	@Override
	public Connection newConnection() throws Exception {
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection("jdbc:postgresql://localhost:5432/book_market",
				"postgres",
				"postgres");
	}
}
