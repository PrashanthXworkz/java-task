package com.xworkz.hashmap.runner;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<Integer,String>();
        myMap.put(1, "Mango");
        myMap.put(2, "Banana");
        myMap.put(3, "orange");
        myMap.put(4, "pinapple");
        myMap.put(5, "grapes");
        myMap.put(6, "chakota");
        myMap.put(7, "watermelon");
        myMap.put(8, "kiwi");
        myMap.put(9, "promogranates");
        myMap.put(10, "apple");

        System.out.println("1. All values: " + myMap.values());

        System.out.println("2. All keys: " + myMap.keySet());

        int newKey = 11;
        String newValue = "sugarcane";
        myMap.putIfAbsent(newKey, newValue);

        int checkKey = 4;
        System.out.println("4. Is '" + checkKey + "' present in the map? " + myMap.containsKey(checkKey));

        int checkValue =3;
        System.out.println("5. Is '" + checkValue + "' present in the map values? " + myMap.containsValue(checkValue));

        System.out.println("6. Size of the map: " + myMap.size());

        int getKey = 6;
        if (myMap.containsKey(getKey)) {
            String valueByKey = myMap.get(getKey);
            System.out.println("7. Value for '" + getKey + "': " + valueByKey);
        } else {
            System.out.println("7. '" + getKey + "' not found in the map.");
        }

	}

}
