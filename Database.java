
import java.sql.*;

public class Database {

    private static Connection conn = null;

    private Database() {

    }

    public static Connection Conn() throws SQLException {

        String host = "127.0.0.1";
        String port = "3306";
        String databaseName = "teclms";
        String userName = "root";
        String password = "1234";
        String url = "jdbc:mysql://" + host + ":" + port + "/" + databaseName + "?sslmode=require";

        if (conn == null || conn.isClosed()) {
            try {
                conn = DriverManager.getConnection(url, userName, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return conn;
    }
}