package creationalPattern.factory_method_design_pattern.book;

import creationalPattern.factory_method_design_pattern.app.BookApplication;
import creationalPattern.factory_method_design_pattern.connection.IConnectionFactory;

import java.sql.Statement;

public class BookRepositoryImpl implements IBookRepository {
	private final IConnectionFactory connectionFactory
			= BookApplication
			.getInstance()
			.getConnectionFactory();

	@Override
	public void save(Book book) throws Exception {
		final String query = "INSERT INTO book (name, author_id, category_id) VALUES (?, ?, ?)";
		try (var connection = connectionFactory.newConnection()) {
			try (var preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
				preparedStatement.setString(1, book.getName());
				preparedStatement.setLong(2, book.getAuthorId());
				preparedStatement.setLong(3, book.getCategoryId());
				try (var generatedKeys = preparedStatement.getGeneratedKeys()) {
					if (generatedKeys.next()) {
						book.setId(generatedKeys.getLong(1));
					}
				}
			}
		}
	}
}
