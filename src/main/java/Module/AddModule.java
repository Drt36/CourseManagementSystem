
package Module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AddModule {
    //add module
    public int addModule(int course_id, String username,String module_name,String level,String type) throws ClassNotFoundException{
        int result = 0;
                       String INSERT_USERS_SQL = "INSERT INTO module" +
                            "  (course_id,username,module_name,level1,type1) VALUES " +"(?,?,?,?,?);";

                    
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        try(
                            Connection connection = DriverManager
                            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

                            // Step 2:Create a statement using connection object
                            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
                            preparedStatement.setInt(1,course_id);
                            preparedStatement.setString(2,username);
                            preparedStatement.setString(3,module_name);
                             preparedStatement.setString(4,level);
                              preparedStatement.setString(5,type);
     
                            // Step 3: Execute the query or update query0
                            result=preparedStatement.executeUpdate();
                       
                        } catch (SQLException e) {
                            System.out.println(e);
                            
                        }
        return result;
       }
    
}
