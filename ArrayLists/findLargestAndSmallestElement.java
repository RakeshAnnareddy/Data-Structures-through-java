import java.util.ArrayList;

public class findLargestAndSmallestElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(15);
        numbers.add(20);
        numbers.add(1);

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("The smallest element is: " + smallest);
        System.out.println("The largest element is: " + largest);
    }
}
