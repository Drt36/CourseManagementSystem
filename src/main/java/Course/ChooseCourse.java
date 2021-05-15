
package Course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ChooseCourse {
    //choose course
    public int chooseCourse(String username,int course_id) throws ClassNotFoundException{
        int result = 0;
                       String INSERT_USERS_SQL = "INSERT INTO choosedcource" +
                            "  (username,course_id) VALUES " +"(?,?);";

                    
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        try(
                            Connection connection = DriverManager
                            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

                            // Step 2:Create a statement using connection object
                            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
                            preparedStatement.setString(1,username);
                            preparedStatement.setInt(2,course_id);
     
                            // Step 3: Execute the query or update query0
                            result=preparedStatement.executeUpdate();
                       
                        } catch (SQLException e) {
                            System.out.println(e);
                            
                        }
        return result;
       }
    
}
