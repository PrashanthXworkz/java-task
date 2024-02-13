package com.xworkz.hashmap.runner;

import java.util.HashMap;
import java.util.Map;

public class BookRunner {

	public static void main(String[] args) {
		Map<Integer, String> book = new HashMap<Integer,String>();
        book.put(101, "ramayana");
        book.put(102, "mahabharat");
        book.put(103, "saviNenapu");
        book.put(104, "naguva");
        book.put(105, "dudime");
        book.put(106, "kanasu");
        book.put(107, "valmiki");
        book.put(108, "darshana");
        book.put(109, "historical");
        book.put(110, "atma");

        System.out.println("1. All values: " + book.values());

        System.out.println("2. All keys: " + book.keySet());

        int newKey = 111;
        String newValue = "Jeevana";
        book.putIfAbsent(newKey, newValue);

        int checkKey = 107;
        System.out.println("4. Is '" + checkKey + "' present in the map? " + book.containsKey(checkKey));

        int checkValue =106;
        System.out.println("5. Is '" + checkValue + "' present in the map values? " + book.containsValue(checkValue));

        System.out.println("6. Size of the map: " + book.size());

        int getKey = 104;
        if (book.containsKey(getKey)) {
            String valueByKey = book.get(getKey);
            System.out.println("7. Value for '" + getKey + "': " + valueByKey);
        } else {
            System.out.println("7. '" + getKey + "' not found in the map.");
        }

	}

}
