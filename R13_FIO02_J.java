/*Rule 13. Input Output (FIO)
FIO02-J. Detect and handle file-related errors
Compliant Code:*/
import java.io.File;

public class R13_FIO02_J{

  public static void main(String [] args){
    File file = new File("file");
    if (!file.delete()) {
        System.out.println("Deletion failed");
        }
  }

}

