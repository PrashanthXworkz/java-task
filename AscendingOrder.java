 class AscendingOrder {
   public static void sortAscending(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        sortAscending(arr);
        
        System.out.println("Sorted Array in Ascending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
