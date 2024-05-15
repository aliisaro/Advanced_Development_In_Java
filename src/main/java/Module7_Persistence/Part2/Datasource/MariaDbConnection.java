package Module7_Persistence.Part2.Datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDbConnection {
    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            // connect if necessary
            try {
                conn = DriverManager.getConnection(
                        "jdbc:mariadb://localhost:3306/CurrencyDatabase?user=appuser&password=password");
                if (conn != null && !conn.isClosed()) {
                    System.out.println("Connected to the database.");
                } else {
                    System.out.println("Failed to connect to the database.");
                }
            } catch (SQLException e) {
                System.out.println("Connection failed.");
                e.printStackTrace();
            }
            return conn;
        } else {
            return conn;
        }
    }

    public static void terminate() {
        try {
            getConnection().close();
            System.out.println("Connection terminated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

