package com.xworkz.hashmap.runner;

import java.util.HashMap;
import java.util.Map;

public class MovieRunner {

	public static void main(String[] args) {
		Map<Integer, String> Map = new HashMap<Integer,String>();
        Map.put(001, "katera");
        Map.put(002, "duniya");
        Map.put(003, "veda");
        Map.put(004, "charli");
        Map.put(005, "Kannadiga");
        Map.put(006, "salar");
        Map.put(007, "upadyaksha");
        Map.put(118, "adyksha");
        Map.put(119, "vamshi");
        Map.put(110, "miss you");

        System.out.println("1. All values: " + Map.values());

        System.out.println("2. All keys: " + Map.keySet());

        int newKey = 117;
        String newValue = "charitre";
        Map.putIfAbsent(newKey, newValue);

        int checkKey = 007;
        System.out.println("4. Is '" + checkKey + "' present in the map? " + Map.containsKey(checkKey));

        int checkValue =002;
        System.out.println("5. Is '" + checkValue + "' present in the map values? " + Map.containsValue(checkValue));

        System.out.println("6. Size of the map: " + Map.size());

        int getKey = 110;
        if (Map.containsKey(getKey)) {
            String valueByKey = Map.get(getKey);
            System.out.println("7. Value for '" + getKey + "': " + valueByKey);
        } else {
            System.out.println("7. '" + getKey + "' not found in the map.");
        }

	}

}
