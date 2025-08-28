package arraylist;
import java.util.ArrayList;

public class DuplicatesElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(50);
        list.add(30);

        System.out.print("Duplicate elements: ");
        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (list.get(k).equals(list.get(i))) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (!alreadyPrinted) {
                        System.out.print(list.get(i) + " ");
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.print("No duplicates found.");
        }
    }
}
