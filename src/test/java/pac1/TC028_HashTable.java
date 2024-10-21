package pac1;
import java.util.*;

public class TC028_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Double> ht = new Hashtable<String,Double>();
		ht.put("Arun", 34.55);
		ht.put("Ram", 123.4);
		ht.put("Hi", 23.5);
		System.out.println(ht);
		System.out.println(ht.values());
		System.out.println(ht.keySet());
		
	}

}
