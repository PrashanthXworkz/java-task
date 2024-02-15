package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringRunner {

	public static void main(String[] args) {
		
		        System.out.println("Main method started");

		        
		        Map<String, List<String>> dataMap = new HashMap<>();

		      
		        String[] words = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi"};

		       
		        for (int i = 0; i < words.length; i++) {
		            String key = words[i];

		            
		            dataMap.computeIfAbsent(key, k -> new ArrayList<>()).add("Position: " + (i + 1));
		        }

		     
		        System.out.println("Data in the map:");
		        readData(dataMap);

		       
		        String keyToFind = "banana";
		        findAndDisplay(dataMap, keyToFind);
		    }

		    
		    private static void readData(Map<String, List<String>> map) {
		        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
		            String key = entry.getKey();
		            List<String> values = entry.getValue();
		            System.out.println("Key: " + key + ", Values: " + values);
		        }
		    }

		    
		    private static void findAndDisplay(Map<String, List<String>> map, String keyToFind) {
		        List<String> values = map.get(keyToFind);

		        if (values != null) {
		            System.out.println("Values for key " + keyToFind + ": " + values);
		        } else {
		            System.out.println("Key " + keyToFind + " not found in the map.");
		        }
		    }
		}


	
