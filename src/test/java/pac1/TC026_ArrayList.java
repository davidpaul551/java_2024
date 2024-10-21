package pac1;
import java.util.*;

public class TC026_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> List1  = new ArrayList<String>();
		List1.add("Hello");
		List1.add("World");
		System.out.println(List1);
		
		System.out.println("Size : "+List1.size());
		
		System.out.println(List1.contains("Hello"));
		
		System.out.println(List1.get(1));
		
		System.out.println(List1.remove(1));
		
		System.out.println(List1);		

	}

}
