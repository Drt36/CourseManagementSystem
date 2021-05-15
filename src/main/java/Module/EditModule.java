
package Module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class EditModule {
    //Update MOdule
    public int updateModule(int module_id,int course_id,String username,String module_name,String level,String type) throws ClassNotFoundException, SQLException {
        int result=0;
            Class.forName("com.mysql.cj.jdbc.Driver");

            try(Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("Update module set  course_id= ?,username=?,module_name=?,level1=?,type1=? where module_id= ? ")) {
            preparedStatement.setInt(1,course_id);
            preparedStatement.setString(2,username);
            preparedStatement.setString(3,module_name);
            preparedStatement.setString(4,level);
            preparedStatement.setString(5,type);
            preparedStatement.setInt(6,module_id);
            
          
            result=preparedStatement.executeUpdate();
            

        } catch (SQLException e) {
            // process sql exception
            System.out.println(e);
        }
        return result;
    }
    
}
