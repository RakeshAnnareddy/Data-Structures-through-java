public class isPalindromeArray {
    public static boolean isPalindrome(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }

        return true; // It's a palindrome
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};
        if(isPalindrome(arr)){
            System.out.println("This is a palindrome array");
        }else{
            System.out.println("This is not a palindrome array");
        }
    }
}
