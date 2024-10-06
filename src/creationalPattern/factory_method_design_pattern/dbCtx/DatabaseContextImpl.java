package creationalPattern.factory_method_design_pattern.dbCtx;

import creationalPattern.factory_method_design_pattern.author.Author;
import creationalPattern.factory_method_design_pattern.author.AuthorRepositoryImpl;
import creationalPattern.factory_method_design_pattern.book.Book;
import creationalPattern.factory_method_design_pattern.book.BookRepositoryImpl;
import creationalPattern.factory_method_design_pattern.category.Category;
import creationalPattern.factory_method_design_pattern.category.CategoryRepositoryImpl;
import creationalPattern.factory_method_design_pattern.repository.IRepository;

public class DatabaseContextImpl implements IDatabaseContext {
	@Override
	public <E, R extends IRepository<E>> R newRepository(Class<E> repositoryClass) {
		if (repositoryClass == Author.class) {
			return (R) new AuthorRepositoryImpl();
		}

		if (repositoryClass == Category.class) {
			return (R) new CategoryRepositoryImpl();
		}

		if (repositoryClass == Book.class) {
			return (R) new BookRepositoryImpl();
		}

		throw new IllegalArgumentException("Unknown repository class: " + repositoryClass.getName());
	}
}
