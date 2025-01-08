import java.util.ArrayList;
class ArrayListCreation{
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=0;i<=10;i++){
            numbers.add(i);
        }
        System.out.println("The numbers are:");
        for(int nums:numbers){
            System.out.print(nums+" ");
        }
    }
}