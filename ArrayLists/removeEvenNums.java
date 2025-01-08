//Remove all even numbers from an ArrayList of integers.
import java.util.ArrayList;
import java.util.Iterator;
public class removeEvenNums {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(6);
        System.out.println("Before removing all even numbers");
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("After removing all even numbers");
        System.out.println(numbers);
    }
}

