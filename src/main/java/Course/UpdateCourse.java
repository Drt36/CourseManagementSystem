
package Course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateCourse {
    //Update course
    public int updateCourse(int course_id,String course_name,String course_duration,String course_credit) throws ClassNotFoundException, SQLException {
        int result=0;
            Class.forName("com.mysql.cj.jdbc.Driver");

            try(Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("Update course set  course_name= ?,course_duration=?,course_credit=? where course_id= ? ")) {
            preparedStatement.setString(1,course_name);
            preparedStatement.setString(2,course_duration);
            preparedStatement.setString(3,course_credit);
            preparedStatement.setInt(4,course_id);
            
          
            result=preparedStatement.executeUpdate();
            

        } catch (SQLException e) {
            // process sql exception
            System.out.println(e);
        }
        return result;
    }
}
