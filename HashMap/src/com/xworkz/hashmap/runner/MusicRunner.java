package com.xworkz.hashmap.runner;

import java.util.HashMap;
import java.util.Map;

public class MusicRunner {

	public static void main(String[] args) {
		Map<Integer, String> music = new HashMap<Integer,String>();
		 music .put(1, "Bad Boys");
		 music .put(2, "Nenne Tanaka");
		 music .put(3, "Pushpavati");
		 music .put(4, "pasandagavane");
		 music .put(5, "kadalanu");
		 music .put(6, "Ninidale");
		 music .put(7, "Anisuthide");
		 music .put(8, "Matte Nodbeda");
		 music .put(9, "Ninnanu Nodida");
		 music .put(10, "Olave Olave");

        System.out.println("1. All values: " + music.values());

        System.out.println("2. All keys: " + music.keySet());

        int newKey = 11;
        String newValue = "Tangali";
        music.putIfAbsent(newKey, newValue);

        int checkKey = 7;
        System.out.println("4. Is '" + checkKey + "' present in the map? " + music.containsKey(checkKey));

        int checkValue =2;
        System.out.println("5. Is '" + checkValue + "' present in the map values? " + music.containsValue(checkValue));

        System.out.println("6. Size of the map: " + music.size());

        int getKey = 4;
        if (music.containsKey(getKey)) {
            String valueByKey = music.get(getKey);
            System.out.println("7. Value for '" + getKey + "': " + valueByKey);
        } else {
            System.out.println("7. '" + getKey + "' not found in the map.");
        }

	}

}
