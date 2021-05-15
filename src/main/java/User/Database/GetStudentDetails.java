
package User.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetStudentDetails {
    //getting level from student database
    public String  getDataOfStudent(String username)throws ClassNotFoundException, SQLException {
        String level = null;
            
            Class.forName("com.mysql.cj.jdbc.Driver");

          try(Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("select * from students where  username= ? ")) {
            preparedStatement.setString(1,username);
            
            ResultSet rs = preparedStatement.executeQuery();
             while (rs.next()) {
                   
                    level=rs.getString("levels");
                   
                }

        } catch (SQLException e) {
            // process sql exception
            System.out.println(e);
        }
        return level;
    }
    
}
