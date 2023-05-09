package dbprogramming;
import java.sql.*;
import java.util.logging.*;

public class LAB11 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root" ;
        String password = "@om454788" ;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =  DriverManager.getConnection(url , username , password);
            Statement statement= connection.createStatement();
            String sql = "DELETE FROM student WHERE studentID='111111'";
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB11.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB11.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}