public class checkIfArrayIsSortedOrNot {
    public static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr1[]={2,3,4,1,5,6,7};
        int arr2[]={1,2,3,4,5,6,7};
        System.out.println("Is Array1 is sorted:"+isSorted(arr1));
        System.out.println("Is Array2 is sorted:"+isSorted(arr2));
    }
    
}
