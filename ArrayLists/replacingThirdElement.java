//Replace the third element of an ArrayList with a new value.
import java.util.ArrayList;
public class replacingThirdElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(6);
        numbers.add(4);
        numbers.add(5);
        System.out.println("The Elements are:"+numbers);
        if (numbers.size() > 2) { 
            numbers.set(2, 3);
            System.out.println("After replacing third element: " + numbers);
        } else {
            System.out.println("The list does not have a third element to replace.");
        }
    }
}
