package smart_serve_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/SmartServe"; // your DB
    private static final String USER = "root"; // MySQL username
    private static final String PASSWORD = ""; // MySQL password

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL driver
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected!"); // for testing
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "MySQL Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database connection failed: " + e.getMessage());
        }
        return con;
    }
}