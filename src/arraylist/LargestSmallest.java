package arraylist;
import java.util.ArrayList;

public class LargestSmallest  {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(7);
        list.add(23);
        list.add(2);
        list.add(18);

        int smallest = list.get(0);
        int largest = list.get(0);

        for (int num : list) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("ArrayList: " + list);
        System.out.println("Smallest Element: " + smallest);
        System.out.println("Largest Element: " + largest);
    }
}
