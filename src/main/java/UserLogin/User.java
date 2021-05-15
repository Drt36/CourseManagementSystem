
package UserLogin;
//this is super  class
public class User {
    private String username;
    private String user_fullname;
    private String user_email;
    private String user_contact;
    private String user_address;
    private String user_dateofbirth;
    private String user_gender;
    private String user_role;
    private String user_password;

    public User() {
    }

    public User(String username, String user_fullname, String user_email, String user_contact, String user_address, String user_dateofbirth, String user_gender, String user_role, String user_password) {
        this.username = username;
        this.user_fullname = user_fullname;
        this.user_email = user_email;
        this.user_contact = user_contact;
        this.user_address = user_address;
        this.user_dateofbirth = user_dateofbirth;
        this.user_gender = user_gender;
        this.user_role = user_role;
        this.user_password = user_password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_fullname() {
        return user_fullname;
    }

    public void setUser_fullname(String user_fullname) {
        this.user_fullname = user_fullname;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_contact() {
        return user_contact;
    }

    public void setUser_contact(String user_contact) {
        this.user_contact = user_contact;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_dateofbirth() {
        return user_dateofbirth;
    }

    public void setUser_dateofbirth(String user_dateofbirth) {
        this.user_dateofbirth = user_dateofbirth;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
    
    
}
