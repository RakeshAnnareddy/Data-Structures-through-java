public class findingMaximumElement{
    public static int largest(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,8,1,4,3,5,4,7};
        System.out.println("The largest element is:"+largest(arr));
    }
}