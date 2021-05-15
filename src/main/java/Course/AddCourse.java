
package Course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AddCourse {
    //add course
    public int addCourse(String course_name, String course_duration,String course_credit) throws ClassNotFoundException{
        int result = 0;
                       String INSERT_USERS_SQL = "INSERT INTO course" +
                            "  (course_name,course_duration,course_credit) VALUES " +"(?,?,?);";

                    
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        try(
                            Connection connection = DriverManager
                            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

                            // Step 2:Create a statement using connection object
                            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
                            preparedStatement.setString(1,course_name);
                            preparedStatement.setString(2,course_duration);
                            preparedStatement.setString(3,course_credit);
     
                            // Step 3: Execute the query or update query0
                            result=preparedStatement.executeUpdate();
                       
                        } catch (SQLException e) {
                            System.out.println(e);
                            
                        }
        return result;
       }
    
}
