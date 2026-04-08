
package testconnection;
import java.sql.Connection;
public class java {
    

public class TestConnection {
    public static void main(String[] args) {
        Connection con = DBConnection.connect();
        if(con != null){
            System.out.println("Connected!");
        }
    }
}
    
}
