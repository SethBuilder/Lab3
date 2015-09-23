

import FormatIO.Console;
import FormatIO.StringIn;

public class Ex2 {
	
	public static void main (String[] arg){
		//Creating console object
		Console con = new Console();
		
		//reading a line from user
		String str = con.readLine();
		
		//saving input into StringIn object
		StringIn strIn = new StringIn(str);
		
		//reading a word from input and printing it in red
		String word = strIn.readWord();
		System.err.println("Your word is: " + word);
		
		//reading a double from input and printing it in red
		Double doub = strIn.readDouble();
		System.err.println("YOur double is: " + doub);
		
	}

}
