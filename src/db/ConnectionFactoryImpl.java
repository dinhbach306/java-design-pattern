package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryImpl implements ConnectionFactory {
	@Override
	public Connection newConnection() throws SQLException, ClassNotFoundException {
		Class.forName("org.postgresql.Driver");

		return DriverManager.getConnection("jdbc:postgresql://localhost:5432/book_mark", "postgres", "postgres");
	}
}
