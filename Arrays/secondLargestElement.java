public class secondLargestElement {
    public static int secondLargest(int[] arr){
        int largest=arr[0];
        int secondLargestElement=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargestElement=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargestElement && arr[i]!=largest ){
                secondLargestElement=arr[i];
            }
        }return secondLargestElement;
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,4,6,5,8,10,9,13,12};
        System.out.println("The Second highest element is:"+secondLargest(arr));
    }
}
