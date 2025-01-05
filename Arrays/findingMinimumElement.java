public class findingMinimumElement {
    public static int smallest(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]< min) min=arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={5,3,0,1,2,4,8};
        System.out.println("The Minimum Element is:"+smallest(arr));
    }
}
