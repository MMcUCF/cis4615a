/*
Rule 03: Numeric Types and Operations (NUM)
NUM03-J: Use integer types that can fully represent the possible range of unsigned data.
Compliant Code:*/
import java.io.DataInputStream;
import java.lang.Exceptions;

 public class R03_NUM03_J
{
	public static void main(String[] args){
    DataInputStream is = 34;
    getInteger(is);


	}

	public static long getInteger(DataInputStream is) throws IOException{
		return is.readInt() & 0xFFFFFFFFL; //Mask with 32 one-bits
	}
}
