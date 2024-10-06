package creationalPattern.factory_method_design_pattern.category;

import creationalPattern.factory_method_design_pattern.app.BookApplication;
import creationalPattern.factory_method_design_pattern.connection.IConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CategoryRepositoryImpl implements ICategoryRepository {
	private final IConnectionFactory connectionFactory
			= BookApplication
			.getInstance()
			.getConnectionFactory();

	@Override
	public void save(Category category) throws Exception {
		final String query = "INSERT INTO category (name) VALUES (?)";
		try (Connection connection = connectionFactory.newConnection()) {
			try (var preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
				preparedStatement.setString(1, category.getName());
				preparedStatement.executeUpdate();
				try(ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
					if (generatedKeys.next()) {
						category.setId(generatedKeys.getLong(1));
					}
				}
			}
		}
	}
}
