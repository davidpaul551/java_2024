package pac1;
import java.util.*;


public class TC027_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//No order is maintained in HashSet , if you want to maintain use LinkedHashSet
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(100);
		h1.add(200);
		h1.add(300);
		h1.add(400);
		h1.add(100);
		for(Integer index:h1) {
			System.out.println(index+"");
		}
		System.out.println(h1.size());
		
		HashSet<String> s1 = new HashSet<String>();
		s1.add("banana");
		s1.add("hi");
		System.out.println(s1);
		for(String index:s1) {
			System.out.println(index);
		}

	}

}
