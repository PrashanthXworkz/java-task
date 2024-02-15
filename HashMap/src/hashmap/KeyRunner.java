package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyRunner {

	public static void main(String[] args) {
		
		        System.out.println("Main method started");

		      
		       Map<Integer, List<Integer>> dataMap = new HashMap<>();
		        
		        String[] array = {"apple", "banana", "orange"};
		        List<String> list = Arrays.asList(array);

		        System.out.println("Array: " + Arrays.toString(array));
		        System.out.println("List: " + list);
		        
		        int[] numbers = {5, 2, 8, 1, 7};
		        Arrays.sort(numbers);

		        System.out.println("Sorted array: " + Arrays.toString(numbers));
		        
		        int[] originalArray = {1, 2, 3, 4, 5};
		        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);

		        System.out.println("Original array: " + Arrays.toString(originalArray));
		        System.out.println("Copied array: " + Arrays.toString(copiedArray));

		        
		       
		    }
		}


	
