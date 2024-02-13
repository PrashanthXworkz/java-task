package com.xworkz.hashmap.runner;

import java.util.HashMap;
import java.util.Map;

public class ThinkRunner {

	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<Integer,String>();
        myMap.put(1, "book");
        myMap.put(2, "pen");
        myMap.put(3, "pencil");
        myMap.put(4, "rubber");
        myMap.put(5, "marker");
        myMap.put(6, "handbag");
        myMap.put(7, "kerchief");
        myMap.put(8, "mask");
        myMap.put(9, "box");
        myMap.put(10, "bookbag");

        System.out.println("1. All values: " + myMap.values());

        System.out.println("2. All keys: " + myMap.keySet());

        int newKey = 11;
        String newValue = "paints";
        myMap.putIfAbsent(newKey, newValue);

        int checkKey = 7;
        System.out.println("4. Is '" + checkKey + "' present in the map? " + myMap.containsKey(checkKey));

        int checkValue =2;
        System.out.println("5. Is '" + checkValue + "' present in the map values? " + myMap.containsValue(checkValue));

        System.out.println("6. Size of the map: " + myMap.size());

        int getKey = 4;
        if (myMap.containsKey(getKey)) {
            String valueByKey = myMap.get(getKey);
            System.out.println("7. Value for '" + getKey + "': " + valueByKey);
        } else {
            System.out.println("7. '" + getKey + "' not found in the map.");
        }

	}

}
