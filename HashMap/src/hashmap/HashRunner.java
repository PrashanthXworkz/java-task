package hashmap;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashRunner {

	public static void main(String[] args) {
		

	
		        System.out.println("main method started");

		        Map<String, Integer> map = new HashMap<>();
		        map.put("apple", 5);
		        map.put("banana", 3);
		        map.put("orange", 7);

		        
		        List<String> keysList = new ArrayList<>(map.keySet());
		        System.out.println("Keys List: " + keysList);

		        
		        List<Integer> valuesList = new ArrayList<>(map.values());
		        System.out.println("Values List: " + valuesList);
		        
		        
		        Map<String, Integer> map1 = new HashMap<>();
		        map.put("apple", 5);
		        map.put("banana", 3);
		        map.put("orange", 7);

		      
		        List<Map.Entry<String, Integer>> sortedByKeyList = new ArrayList<>(map.entrySet());
		        Collections.sort(sortedByKeyList, Map.Entry.comparingByKey());
		        System.out.println("Sorted by Key: " + sortedByKeyList);

		        
		        List<Map.Entry<String, Integer>> sortedByValueList = new ArrayList<>(map.entrySet());
		        Collections.sort(sortedByValueList, Map.Entry.comparingByValue());
		        System.out.println("Sorted by Value: " + sortedByValueList);
		        
		        
		        
		        
		        
		        
		        

		       
		    }
		}


	


