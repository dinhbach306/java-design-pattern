import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Mains {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/book_market";
        String username = "postgres";
        String password = "postgres";


        // Register the PostgreSQL driver

        Class.forName("org.postgresql.Driver");

        // Connect to the database

        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

        // Perform desired database operations
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM author");

        while (resultSet.next())
        {
            String columnValue = resultSet.getString("name");
            System.out.println("Column Value: " + columnValue);
        }
        // Close the connection
        connection.close();
    }
}