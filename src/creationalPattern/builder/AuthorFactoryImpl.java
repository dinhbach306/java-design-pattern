package creationalPattern.builder;

public class AuthorFactoryImpl implements IFactory<AuthorBuilder> {
	@Override
	public AuthorBuilder newBuilder() {
		return new AuthorBuilder();
	}
}
