public class reversingArray {
    public static int[] reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr; 
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int[] reversed = reverseArray(arr);

        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}
