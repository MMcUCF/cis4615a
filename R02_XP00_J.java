/*Rule 02. Expressions (EXP)
XP00-J: Do not ignore values returned by methods
Compliant Code:*/
import java.io.File;
import java.util.Scanner;

 public class R02_XP00_J
{
	public static void main(String[] args){
		deleteFile();
	}

	public static void deleteFile(){

		File someFile = new File("someFileName.txt");
		if(!someFile.delete()){
			System.out.println("Error: file did not delete.");
		}
	}
}
