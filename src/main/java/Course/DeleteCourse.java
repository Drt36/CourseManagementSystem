
package Course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DeleteCourse {
    //Delete Course
    public int deleteCourse(int course_id) throws ClassNotFoundException, SQLException {
        int result=0;
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            try(Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("Delete from course where course_id= ?  ")) {
            preparedStatement.setInt(1,course_id);
    
            
            result=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // process sql exception
            System.out.println(e);
        }
            return result;
    }
    
}
