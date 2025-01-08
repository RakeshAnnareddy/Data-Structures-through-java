//Remove all even numbers from an ArrayList of integers.
import java.util.ArrayList;
public class removeEvenNums {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(6);
        System.out.println("Before removing all even numbers");
        for(int nums:numbers){
            System.out.print(nums+" ");
        }
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)%2==0)
            numbers.remove(i);
        }
        System.out.println();
        System.out.println("After removing all even numbers");
        for(int nums:numbers){
            System.out.print(nums+" ");
        }
    }
}
