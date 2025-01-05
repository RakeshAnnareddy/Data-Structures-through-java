public class isPalindromeArray {
    public static boolean isPalindrome(int[] arr){
        int a[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i];
        }
        int start=0,end=arr.length-1;
        
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        if (arr.length == a.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != a[i]) {
                    return false;
                }
            }
        } return true;
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
