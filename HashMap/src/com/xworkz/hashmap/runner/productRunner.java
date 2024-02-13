package com.xworkz.hashmap.runner;

import java.util.HashMap;
import java.util.Map;

public class productRunner {

	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<Integer,String>();
        myMap.put(11, "TV");
        myMap.put(12, "Fan");
        myMap.put(13, "Oven");
        myMap.put(14, "Fridge");
        myMap.put(15, "washing Machine");
        myMap.put(16, "Hair Dryer");
        myMap.put(17, "wash cleaner");
        myMap.put(18, "trimer");
        myMap.put(19, "Iron Box");
        myMap.put(20, "Electric stove");

        System.out.println("1. All values: " + myMap.values());

        System.out.println("2. All keys: " + myMap.keySet());

        int newKey = 21;
        String newValue = "stove";
        myMap.putIfAbsent(newKey, newValue);

        int checkKey = 17;
        System.out.println("4. Is '" + checkKey + "' present in the map? " + myMap.containsKey(checkKey));

        int checkValue =15;
        System.out.println("5. Is '" + checkValue + "' present in the map values? " + myMap.containsValue(checkValue));

        System.out.println("6. Size of the map: " + myMap.size());

        int getKey =14;
        if (myMap.containsKey(getKey)) {
            String valueByKey = myMap.get(getKey);
            System.out.println("7. Value for '" + getKey + "': " + valueByKey);
        } else {
            System.out.println("7. '" + getKey + "' not found in the map.");
        }

	}

}
