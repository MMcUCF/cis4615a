/*Rule 06: Methods (MET)
MET01-J: Never use assertions to validate method arguments.
Compliant Code:*/
import java.lang.*;

 public class R06_MET01_J
{
	public static void main(String[] args){

    System.out.print(getAbsAdd(42, 123));

	}

	public static int getAbsAdd(int x, int y){
		if(x == Integer.MIN_VALUE || y == Integer.MIN_VALUE){
			throw new IllegalArgumentException();
      }
		int absX = Math.abs(x);
		int absY = Math.abs(y);
		if(absX > Integer.MAX_VALUE - absY){
			throw new IllegalArgumentException();
		}
		return absX + absY;
	}

}
