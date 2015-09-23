import FormatIO.*;


public class Ex3 {
	
	public static void main (String[] arg){
		
		Console con = new Console();
		
		//first name
		con.println("What is your first name: ");
		String firstName = con.readWord();
		
		
		//last name
		con.println("What is your last name: ");
		String lastName = con.readWord();
		
		
		//day
		con.println("What is your DOB? ");
		System.out.println("Day? ");
		int day = con.readInt();
		
		
		//month
		con.println("Month? ");
		int month = con.readInt();
		
		
		//year
		con.println("Year? ");
		int year = con.readInt();
		
		//creating a file
		FileOut fout = new FileOut("Lab3personnel.txt");
	    
		//creating a format String object
		String s = String.format("Hi, your full name is %12s %12s and you were born on %02d / %02d / %04d", firstName, lastName, day, month, year);
		
		//print to file
		fout.print(s);
		con.println(s);
		
	}

}
