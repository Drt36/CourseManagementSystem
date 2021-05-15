
package UserLogin;
//this class is subclass of User class
//User class is extented here
public class Instructor extends User {
    private String field;

    public Instructor() {
    }

    public Instructor(String field) {
        this.field = field;
    }

    public Instructor(String field, String username, String user_fullname, String user_email, String user_contact, String user_address, String user_dateofbirth, String user_gender, String user_role, String user_password) {
        super(username, user_fullname, user_email, user_contact, user_address, user_dateofbirth, user_gender, user_role, user_password);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
    
    
}
