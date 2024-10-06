package creationalPattern.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Category implements Cloneable{
	private Long id;
	private String name;

	@Override
	public Category clone() {
		final Category clone = new Category();
		clone.id = id;
		clone.name = name;
		return clone;
	}
}
