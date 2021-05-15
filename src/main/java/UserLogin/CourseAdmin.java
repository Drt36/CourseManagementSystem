
package UserLogin;
//this class is subclass of User class
//User class is extented here
public class CourseAdmin extends User {
    private String Department;

    public CourseAdmin() {
    }
    
    public CourseAdmin(String Department) {
        this.Department = Department;
    }

    public CourseAdmin(String Department, String username, String user_fullname, String user_email, String user_contact, String user_address, String user_dateofbirth, String user_gender, String user_role, String user_password) {
        super(username, user_fullname, user_email, user_contact, user_address, user_dateofbirth, user_gender, user_role, user_password);
        this.Department = Department;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
    
    
    
}
