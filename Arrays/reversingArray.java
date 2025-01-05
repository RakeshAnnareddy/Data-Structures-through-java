public class reversingArray {
    public static int[] reverseArray(int[] a) {
        int start = 0, end = a.length - 1;

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a; 
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int[] reversed = reverseArray(a);

        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}
