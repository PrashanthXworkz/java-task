package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.w3c.dom.Entity;

public class IteratorMap {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,new String("vani"));
		map.put(2,new String("vanita"));
		map.put(3,new String("ramesh"));
		map.put(4,new String("ravi"));
		map.put(5,new String("karthik"));
		System.out.println("values is:"+map);
		
		
		for(Map.Entry<Integer,String> entry:map.entrySet()) {
			System.out.println("keys are:"+entry.getKey());
			System.out.println("values are:"+entry.getValue());
		}
		
	}

}
