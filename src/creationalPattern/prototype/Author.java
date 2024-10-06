package creationalPattern.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Author implements Cloneable {
	private Long id;
	private String name;

	@Override
	public Author clone() {
		final Author clone = new Author();
		clone.id = id;
		clone.name = name;
		return clone;
	}
}
