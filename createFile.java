import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String args[]) {
        try{
            File f0 = new File("C:/Users/shukumar25/Desktop/Java/javaFileOperation.txt");
            if(f0.createNewFile()){
                System.out.print("File" + f0.getName() +"is created succesfully");
            }
            else{
                System.out.print("File already exists in the same location");
            }
            }
            catch(IOException exception){
                System.out.print("An unexpected error has occured");
                exception.printStackTrace();
            }
    }
}
