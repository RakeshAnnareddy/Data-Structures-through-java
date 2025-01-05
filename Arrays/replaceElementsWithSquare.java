public class replaceElementsWithSquare {
    public static int[] square(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]*=arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int squared[]=square(arr);
        System.out.println("The Squares of array elements are:");
        for(int nums:squared){
            System.out.println(nums+" ");
        }
    }
}
