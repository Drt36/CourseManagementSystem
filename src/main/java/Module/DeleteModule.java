
package Module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DeleteModule {
    //Delete module
    public int deleteModule(int module_id) throws ClassNotFoundException, SQLException {
        int result=0;
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            try(Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/cms", "root", "");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("Delete from module where module_id= ?  ")) {
            preparedStatement.setInt(1,module_id);
    
            
            result=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // process sql exception
            System.out.println(e);
        }
            return result;
    }
}
