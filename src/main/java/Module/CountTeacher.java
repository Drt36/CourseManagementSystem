
package Module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CountTeacher {
    int count=0;        
    //count teacher for 4 module
        public int countTeacher(String username) throws ClassNotFoundException, SQLException {
       
            Class.forName("com.mysql.cj.jdbc.Driver");

            try(Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT count(username) as count from module where username=? ")) {
            preparedStatement.setString(1,username);
            
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            count=rs.getInt(1);

        } catch (SQLException e) {
            // process sql exception
            e.printStackTrace();
        }
        return count;
    }
}
