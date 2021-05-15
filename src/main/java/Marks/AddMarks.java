
package Marks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddMarks {
    //add matrks
    public int addMarks(String username,int module_id,float marks,String status) throws ClassNotFoundException{
        int result = 0;
                       String INSERT_USERS_SQL = "INSERT INTO marks" +
                            "  (username,module_id,marks,status1) VALUES " +"(?,?,?,?);";

                    
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        try(
                            Connection connection = DriverManager
                            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

                            // Step 2:Create a statement using connection object
                            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
                            preparedStatement.setString(1,username);
                            preparedStatement.setInt(2,module_id);
                            preparedStatement.setFloat(3,marks);
                            preparedStatement.setString(4,status);
     
                            // Step 3: Execute the query or update query0
                            result=preparedStatement.executeUpdate();
                       
                        } catch (SQLException e) {
                            System.out.println(e);
                            
                        }
        return result;
       }
    
}
