package steps;

import com.mysql.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {
    public void connectDatabase(){
        Connection conn;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn =
                    DriverManager.getConnection("jdbc:mysql://sql4.freemysqlhosting.net:3306/sql4499788", "sql4499788", "UMg8wJbG47");

            System.out.println("Connection to Store DB succesfull!");
            Statement stmt = (Statement) conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `TestTask`");
            System.out.println(rs);
        } catch (SQLException | ClassNotFoundException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());

        }
    }
}
