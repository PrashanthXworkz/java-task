package com.xworkz.hashmap.runner;

import java.util.HashMap;
import java.util.Map;

public class ChatRunner {

	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<Integer,String>();
        myMap.put(51, "MasalaPuri");
        myMap.put(52, "DahiPuri");
        myMap.put(53, "BhelPuri");
        myMap.put(54, "PaniPuri");
        myMap.put(55, "SevPuri");
        myMap.put(56, "Samosa");
        myMap.put(57, "Bhajji");
        myMap.put(58, "FriedRice");
        myMap.put(59, "Gobi");
        myMap.put(60, "ChanaMasala");

        System.out.println("1. All values: " + myMap.values());

        System.out.println("2. All keys: " + myMap.keySet());

        int newKey = 61;
        String newValue = "sweetCorn";
        myMap.putIfAbsent(newKey, newValue);

        int checkKey =55;
        System.out.println("4. Is '" + checkKey + "' present in the map? " + myMap.containsKey(checkKey));

        int checkValue =58;
        System.out.println("5. Is '" + checkValue + "' present in the map values? " + myMap.containsValue(checkValue));

        System.out.println("6. Size of the map: " + myMap.size());

        int getKey =60;
        if (myMap.containsKey(getKey)) {
            String valueByKey = myMap.get(getKey);
            System.out.println("7. Value for '" + getKey + "': " + valueByKey);
        } else {
            System.out.println("7. '" + getKey + "' not found in the map.");
        }

	}

}
