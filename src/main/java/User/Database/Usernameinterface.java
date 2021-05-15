
package User.Database;

import java.io.File;
//interface
public interface Usernameinterface {
    public void createFolder(File f);
    public void readFile(File f);
    public void storeUsername(String username,int line,File f);
    public int countLines(File f);
    public int checkUsername(String username,int line,File f);
}
