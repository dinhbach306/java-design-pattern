package creationalPattern.builder;

import creationalPattern.factory_method_design_pattern.author.Author;
import creationalPattern.factory_method_design_pattern.book.Book;
import creationalPattern.factory_method_design_pattern.category.Category;

public class Main {
	public static void main(String[] args) {
		final EntityFactory entityFactory = new EntityFactoryImpl();
		final Author author = entityFactory.newEntityBuilder(AuthorBuilder.class)
				.id(1L)
				.name("Phạm Ngọc Minh Anh")
				.build();

		final Category category = entityFactory.newEntityBuilder(CategoryBuilder.class)
				.id(1L)
				.name("Chính trị")
				.build();

		final Book book = entityFactory.newEntityBuilder(BookBuilder.class)
				.id(1L)
				.name("Tư tưởng Hồ Chí Minh")
				.authorId(author.getId())
				.categoryId(category.getId())
				.build();

		System.out.println("Author: " + author);
		System.out.println("Category: " + category);
		System.out.println("Book: " + book);
	}
}
