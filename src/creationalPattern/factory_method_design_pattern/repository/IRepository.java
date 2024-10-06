package creationalPattern.factory_method_design_pattern.repository;

public interface IRepository<T> {
	void save(T entity) throws Exception;
}
