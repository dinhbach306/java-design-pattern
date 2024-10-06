package creationalPattern.builder;

public class BookFactoryImpl implements IFactory<BookBuilder>{
	@Override
	public BookBuilder newBuilder() {
		return new BookBuilder();
	}
}
