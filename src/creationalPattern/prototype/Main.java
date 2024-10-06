package creationalPattern.prototype;

public class Main {
	public static void main(String[] args) {
		//Author
		final Author author = new Author();
		author.setId(1L);
		author.setName("Lê Tấn Phúc");

		//Category
		final Category category = new Category();
		category.setId(1L);
		category.setName("Tình yêu");

		//Book
		final Book book = new Book();
		book.setId(1L);
		book.setName("Cho tôi tình yêu");
		book.setAuthorId(author.getId());
		book.setCategoryId(category.getId());


		final Author authorClone = author.clone();
		final Category categoryClone = category.clone();
		final Book bookClone = book.clone();


		System.out.println("Author clone --> " + authorClone);
		System.out.println("Category clone --> " + categoryClone);
		System.out.println("Book clone --> " + bookClone);
	}
}
