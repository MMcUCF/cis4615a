/*Rule 00: Input validation and sanitization (IDS)
  IDS03-J: Do not log unsanitized user input
  Compliant Code:*/
 import java.util.Scanner;
 import java.util.regex.Pattern;

 public class R00_IDS03_J
{
	public static void main(String[] args){

    boolean loginSuccessful = false;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter username");
    String username = scan.nextLine();

    if(sanitizeUsername(username) != "unauthorized user")
      loginSuccessful = true;

		if(loginSuccessful){
  			System.out.println("User login succeeded for: " + sanitizeUsername(username));
		}else{
			System.out.println("User login failed for: " + sanitizeUsername(username));
		}

	}

	public static String sanitizeUsername(String username){
		return Pattern.matches("[A-Za-z0-9]+", username) ? username : "unauthorized user";
	}
}
