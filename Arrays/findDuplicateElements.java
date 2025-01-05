public class findDuplicateElements {
    public static void duplicate(int[] arr) {
        System.out.println("The duplicate elements are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + " ");
                    break; 
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 2,4};
        duplicate(arr);
    } 
}
