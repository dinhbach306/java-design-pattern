package creationalPattern.factory_method_design_pattern.author;

import creationalPattern.factory_method_design_pattern.app.BookApplication;
import creationalPattern.factory_method_design_pattern.connection.IConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AuthorRepositoryImpl implements IAuthorRepository {
	private final IConnectionFactory connectionFactory
			= BookApplication
			.getInstance()
			.getConnectionFactory();
	@Override
	public void save(Author author) throws Exception {
		final String query = "INSERT INTO author (name) VALUES (?)";
		try (Connection connection = connectionFactory.newConnection()) {
			try (var preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
				preparedStatement.setString(1, author.getName());
				preparedStatement.executeUpdate();
				try(ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
					if (generatedKeys.next()) {
						author.setId(generatedKeys.getLong(1));
					}
				}
			}
		}
	}
}
