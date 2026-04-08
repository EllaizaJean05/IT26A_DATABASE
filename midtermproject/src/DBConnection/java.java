package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class java {
    public static Connection connect() {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/manok_db",
                "root",
                ""
            );
            return con;
        } catch (Exception e) {
            System.out.println("Connection Error: " + e);
            return null;
        }
    }
}