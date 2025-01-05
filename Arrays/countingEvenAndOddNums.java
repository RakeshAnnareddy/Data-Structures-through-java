public class countingEvenAndOddNums {
    public static int[] countEvenAndOdd(int[] arr){
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                 evenCount++;
            }
            else oddCount++;
        }
        return new int[]{evenCount, oddCount}; 
    }

    public static void main(String[] args) {
        int arr[]={1,3,7,4,5,6,2,9,10};
        int[] result = countEvenAndOdd(arr); 
        System.out.println("The Count of Even Numbers is:"+result[0]);
        System.out.println("The Count of Even Numbers is:"+result[1]);
    }
}
