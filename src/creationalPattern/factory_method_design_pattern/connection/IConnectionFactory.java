package creationalPattern.factory_method_design_pattern.connection;

import java.sql.Connection;

public interface IConnectionFactory {
	Connection newConnection() throws Exception;
}
