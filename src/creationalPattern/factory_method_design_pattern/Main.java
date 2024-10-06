package creationalPattern.factory_method_design_pattern;


import creationalPattern.factory_method_design_pattern.app.BookApplication;
import creationalPattern.factory_method_design_pattern.author.Author;
import creationalPattern.factory_method_design_pattern.author.IAuthorRepository;
import creationalPattern.factory_method_design_pattern.book.Book;
import creationalPattern.factory_method_design_pattern.book.IBookRepository;
import creationalPattern.factory_method_design_pattern.category.Category;
import creationalPattern.factory_method_design_pattern.category.ICategoryRepository;
import creationalPattern.factory_method_design_pattern.dbCtx.IDatabaseContext;

// Main class to test
public class Main {
	public static void main(String[] args) throws Exception {
		final BookApplication bookApplication = BookApplication.getInstance();
		final IDatabaseContext databaseContext = bookApplication.getDatabaseCtx();
		final IAuthorRepository authorRepository = databaseContext.newRepository(Author.class);
		final ICategoryRepository categoryRepository = databaseContext.newRepository(Category.class);
		final IBookRepository bookRepository = databaseContext.newRepository(Book.class);

		//Lưu author
		final Author author = new Author();
		author.setName("Phạm Ngọc Minh Anh");
		authorRepository.save(author);

		//Lưu category
		final Category category = new Category();
		category.setName("Chính trị");
		categoryRepository.save(category);

		//Lưu book
		final Book book = new Book();
		book.setName("Tư tưởng Hồ Chí Minh");
		book.setAuthorId(author.getId());
		book.setCategoryId(category.getId());
		bookRepository.save(book);
	}
}
