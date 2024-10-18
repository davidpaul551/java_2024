package pac1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC017_RegExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Davidpaul";
		String pattern = "Davidpaul";
		boolean patternMatched = Pattern.matches("Apple", "Welcome David");
		System.out.println("pattern match is : "+patternMatched);
		
		String input = "Welcome David";
		Pattern p1 = Pattern.compile("David");
		Matcher m1 =p1.matcher(input);
		System.out.println(m1.matches());
		
		while(m1.find()){
			System.out.println(m1.group()+":"+m1.start()+":"+m1.end());
			
		}
		
		//Specified Pattern Matcher
		String inp1 = "Exo1";
		Pattern p2 = Pattern.compile("^[A-Z].*[0-9]$");
		Matcher m2 = p2.matcher(inp1);
		if(m2.find()) {
			System.out.println("Found");

		}else {
			System.err.println("Enter code starts with uppercase alphabet and end with digit");

		}
		//Email Matcher
		String email = "pauldavid551@gmail.com.in";
		Pattern p3 = Pattern.compile("^[\\w]+@[\\w]+\\.[\\w.]{3,6}$");
		Matcher m3 = p3.matcher(email);
		if(m3.find()) {
			System.out.println("valid emailId");

		}else {
			System.err.println("not a Valid emailId");

		}
		
		//Digit pattern
		String phone = "7680835761";
		Pattern p4 = Pattern.compile("^\\d{10}$");
		Matcher m4 = p4.matcher(phone);
		if(m4.find()) {
			System.out.println(" digit matched");

		}else {
			System.err.println(" digit not matched");

		}
		//Non Digit pattern
		String digit = "######&&&&";
		Pattern p5 = Pattern.compile("^\\D{10}$");
		Matcher m5 = p5.matcher(digit);
		if(m5.find()) {
			System.out.println("non digit matched");

		}else {
			System.err.println("non digit  not matched");

		}
		
		
		//White Space character
		String whiteSpace = "Welcome David";
		Pattern p6 = Pattern.compile("\\s");
		Matcher m6 = p6.matcher(whiteSpace);
		while(m6.find()) {
			System.out.println(m6.group()+":"+m6.start()+":"+m6.end());

			
		}
		
		//Beginning of the line
		String whiteSpace1 = "Welcome David hi";
		Pattern p7 = Pattern.compile("^Welcomehi$");
		Matcher m7 = p7.matcher(whiteSpace);
		if(m7.find()) {
			System.out.println(m7.group()+":"+m7.start()+":"+m7.end());
			System.out.println("Begining of the line matched ");

			
		}
		else {
			System.out.println("Begining of the line matched ");	
		}
		
		
		
		
		
		
		
		
		

		
		

	}

}
