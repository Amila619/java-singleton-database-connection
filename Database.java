
import java.sql.*;

public class Database {

    private static Connection conn = null;

    private Database() {

    }

    public static Connection Conn() throws SQLException {

        String host = "";
        String port = "";
        String databaseName = "";
        String userName = "";
        String password = "";
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