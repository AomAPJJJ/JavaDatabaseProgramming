package dbprogramming;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

public class LAB13 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root" ;
        String password = "@om454788" ;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =  DriverManager.getConnection(url , username , password);
            String sql = ("UPDATE student SET email=? WHERE studentID=? ");
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,"aaaaaa@kmutt.ac.th");
            preparedStatement.setString(2,"1312");

            preparedStatement.executeUpdate();
       



        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB13.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB13.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}