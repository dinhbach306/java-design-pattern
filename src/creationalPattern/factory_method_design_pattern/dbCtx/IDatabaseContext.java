package creationalPattern.factory_method_design_pattern.dbCtx;

import creationalPattern.factory_method_design_pattern.repository.IRepository;

public interface IDatabaseContext {
	<E, R extends IRepository<E>> R newRepository(Class<E> repositoryClass);
}
