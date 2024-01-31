public class LargestNumber{
	    public static int findLargestNumber(int arr[]) {
        int largest = arr[0]; // Initialize largest with the first element
                  
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
    public static void main(String[] args) {
        int numbers[]= { 89,67,45,3,1};

        // Finding the largest number in the array
        int largestNumber = findLargestNumber(numbers);

        System.out.println("The largest number is: " + largestNumber);
	}
}