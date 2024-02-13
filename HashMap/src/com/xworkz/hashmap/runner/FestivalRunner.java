package com.xworkz.hashmap.runner;

import java.util.HashMap;
import java.util.Map;

public class FestivalRunner {

	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<Integer,String>();
        myMap.put(1, "Ugadi");
        myMap.put(2, "Sankranti");
        myMap.put(3, "Shivaratri");
        myMap.put(4, "Ganesh chaturti");
        myMap.put(5, "vijayDashami");
        myMap.put(6, "Deepavali");
        myMap.put(7, "Tulasi Puja");
        myMap.put(8, "NagaraPanchami");
        myMap.put(9, "MariHabba");
        myMap.put(10, "ratostava");

        System.out.println("1. All values: " + myMap.values());

        System.out.println("2. All keys: " + myMap.keySet());

        int newKey = 11;
        String newValue = "NagaraPuje";
        myMap.putIfAbsent(newKey, newValue);

        int checkKey = 5;
        System.out.println("4. Is '" + checkKey + "' present in the map? " + myMap.containsKey(checkKey));

        int checkValue =8;
        System.out.println("5. Is '" + checkValue + "' present in the map values? " + myMap.containsValue(checkValue));

        System.out.println("6. Size of the map: " + myMap.size());

        int getKey = 2;
        if (myMap.containsKey(getKey)) {
            String valueByKey = myMap.get(getKey);
            System.out.println("7. Value for '" + getKey + "': " + valueByKey);
        } else {
            System.out.println("7. '" + getKey + "' not found in the map.");
        }

	}

}
