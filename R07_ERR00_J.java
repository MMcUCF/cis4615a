/*Rule 07. Exceptional Behavior (ERR)
ERR00-J. Do not supress or ignore checked expressions.
Compliant Code:*/
import java.io.File;
import java.io.FileNotFoundException;

public class R07_ERR00_J{
  public static void main(String [] args){
     boolean validFlag = false;
     File fileName = new File("someFileName.txt");
    do {
    try {
      if(fileName.exists()){
        validFlag = true;
      }else{
        throw new FileNotFoundException();
      }

  } catch (FileNotFoundException e) {
    System.out.println("Please specify another file name.");
    break;
  }
} while (validFlag != true);
  System.out.println("Doing file things.");
  }
}
