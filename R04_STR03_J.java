/*Rule 04. Characters and Strings (STR)
STR03-J. Do not encode noncharacter data as a string.
Compliant Code:*/
import java.math.BigInteger;

 public class R04_STR03_J
{
	public static void main(String[] args){

		BigInteger x = new BigInteger("530500452766");
		String s = x.toString(); //Valid character data
    System.out.println("BigInteger to string: " + s);
    byte [] byteArray = s.getBytes();
		String ns = new String(byteArray);
    System.out.println("Byte Array to string: " + ns);
    x = new BigInteger(ns);
    System.out.println("String to BigInteger: " + x);
	}
}
