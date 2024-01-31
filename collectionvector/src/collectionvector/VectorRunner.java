package collectionvector;

import java.util.Iterator;
import java.util.Vector;

public class VectorRunner {

	public static void main(String[] args) {
		Vector fruits=new Vector();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Pine");
		
		Iterator it=fruits.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		

	}

}
