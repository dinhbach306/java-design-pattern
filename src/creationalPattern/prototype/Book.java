package creationalPattern.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Book implements Cloneable {
	private Long id;
	private String name;
	private Long authorId;
	private Long categoryId;

	@Override
	public Book clone() {
		final Book clone = new Book();
		clone.id = id;
		clone.name = name;
		clone.authorId = authorId;
		clone.categoryId = categoryId;
		return clone;
	}
}
