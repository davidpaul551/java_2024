package pac1;

public class TC009_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str1 = new String("Hi");
		String Str2 = new String("Hello");
		System.out.println(Str1);
		System.out.println(Str2);
		
		String Str3=Str2;
		System.out.println(Str3);
		System.out.println("Length is : "+Str1.length());
		
		System.out.println("Index of l in Str2 is : "+ Str2.indexOf("l"));
		System.out.println("SubString of str2 is : "+Str2.substring(1,4));
		System.out.println("Value Of : "+ Str1.valueOf(30));
		StringBuffer s = new StringBuffer("Apple");
		System.out.println("StringBuffer is : "+s.append(Str2));
		StringBuilder Str4 = new StringBuilder("Apple");
		System.out.println("StringBuilder is : "+Str4);
		
		

	}

}
