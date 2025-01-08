//Check if a specific element exists in an ArrayList of strings.
import java.util.ArrayList;
public class isElementExists {
    public static boolean isNumberExist(ArrayList<Integer> numbers,int num){
            return numbers.contains(num); // Simplified logic

    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        Integer num1=4;
        Integer num2=1;

        System.out.println("Is element exist:"+isNumberExist(numbers,num1));
        System.out.println("Is element exist:"+isNumberExist(numbers,num2));
    }
}
