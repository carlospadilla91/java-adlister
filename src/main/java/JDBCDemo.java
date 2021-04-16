import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class JDBCDemo {
    public static void main(String[] args) {

        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/design_test_db?serverTimezone=UTC&useSSL=false",
                    "carlospadilla",
                    "sarahjeancurran"
            );
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM quotes");
            while(rs.next()) {
                System.out.println("Quote: " + rs.getString("content"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
