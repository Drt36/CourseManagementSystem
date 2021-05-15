
package UserLogin;

//this class is subclass of User class
//User class is extented here
public class Student extends User {
    private String Level;
    private String Section;

    public Student() {
    }

    public Student(String Level, String Section) {
        this.Level = Level;
        this.Section = Section;
    }

    public Student(String Level, String Section, String username, String user_fullname, String user_email, String user_contact, String user_address, String user_dateofbirth, String user_gender, String user_role, String user_password) {
        super(username, user_fullname, user_email, user_contact, user_address, user_dateofbirth, user_gender, user_role, user_password);
        this.Level = Level;
        this.Section = Section;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String Section) {
        this.Section = Section;
    }
    
    
}
