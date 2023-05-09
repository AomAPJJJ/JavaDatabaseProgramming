package dbprogramming;
import java.sql.*;
import java.util.logging.*;


public class LAB8 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb2";
        String username = "root" ;
        String password = "@om454788" ;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =  DriverManager.getConnection(url , username , password);
            Statement statement= connection.createStatement();
            String sql = "SELECT * FROM student " ;
            ResultSet results = statement.executeQuery(sql);
            
             while (results.next()){
                System.out.println(results.getString(1)+ " "+results.getString(2)+" "+results.getString(3)+" "+results.getString(4)+" "+results.getString(5));
                
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}