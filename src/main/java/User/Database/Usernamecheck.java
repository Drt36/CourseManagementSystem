
package User.Database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;


//interface is used here 
public class Usernamecheck implements Usernameinterface  {
   
    //creating folder
    @Override
    public void createFolder(File f){
        if(!f.exists()){
            f.mkdirs();
        }
    }
    
    //reading file
    @Override
    public void readFile(File f){
     
      FileReader fr = null;
      //checking existence of file
      if(f.exists()){
          
          try {
              fr = new FileReader(f);
              System.out.println("file exists!");
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Usernamecheck.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
      //if not exist creating new file
      else{
          FileWriter fw = null;
          try {
              
              fw = new FileWriter(f);
              System.out.println("File created");
              
              
          } catch (IOException ex) {
              Logger.getLogger(Usernamecheck.class.getName()).log(Level.SEVERE, null, ex);
          } finally {
              try {
                  fw.close();
              } catch (IOException ex) {
                  Logger.getLogger(Usernamecheck.class.getName()).log(Level.SEVERE, null, ex);
              }
          }

      }
    }
    
    //storing username into the file
    @Override
     public void storeUsername(String username,int line,File f){
        
        try {
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            for(int i=0;i<line;i++){
                raf.readLine();
            }
            
            if(line>0){
                raf.writeBytes("\r\n");
            }
            raf.writeBytes("Username:"+username+ "\r\n");
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Usernamecheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Usernamecheck.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
     
     //counting line in the textfile
    @Override
    public int countLines(File f){
      int line=0;
        try {
            
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            for(int i=0;raf.readLine()!=null;i++){
                line++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Usernamecheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Usernamecheck.class.getName()).log(Level.SEVERE, null, ex);
        }
      return line;   
        
    }
    
    //checking username exist or not in the text file
    @Override
    public int checkUsername(String username,int line,File f){
       int result=0;
        try {
     
            
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            for(int i=0;i<line;i+=2){

                String forusername = raf.readLine().substring(9);

                if(username.equals(forusername)){
                    result=1;
                    break;
                }else if(i==(line-1)){
                    result=0;
                    break;
                }

                for(int k=1;k<=1;k++){
                    raf.readLine();
                }
            }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Usernamecheck.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Usernamecheck.class.getName()).log(Level.SEVERE, null, ex);
            }
        return result;
           
    }
   
    
   
    
}
