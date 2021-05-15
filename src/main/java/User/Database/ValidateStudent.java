
package User.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ValidateStudent {
    boolean status=false;
    
     //validate email and password for login  to give access in system
    public boolean validateUser(String username,String password) throws ClassNotFoundException, SQLException {
        
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            try(Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select * from students where username = ? and user_password = ? ")) {
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            ResultSet rs = preparedStatement.executeQuery(); 
            status = rs.next();
        } catch (SQLException e) {
            // process sql exception
            e.printStackTrace();
        }
        return status;
    }
    
}
