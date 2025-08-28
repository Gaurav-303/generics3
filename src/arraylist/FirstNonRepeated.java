package arraylist;
import java.util.ArrayList;

public class FirstNonRepeated {

        public static void main(String[] args)
        {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(4);
            list.add(5);
            list.add(1);
            list.add(2);
            list.add(2);
            list.add(5);
            list.add(4);
            list.add(6);

            Integer firstNonRepeated = null;

            for (int i = 0; i < list.size(); i++) {
                int count = 0;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i).equals(list.get(j))) {
                        count++;
                    }
                }
                if (count == 1) {
                    firstNonRepeated = list.get(i);
                    break;
                }
            }

            System.out.println("ArrayList: " + list);
            if (firstNonRepeated != null) {
                System.out.println("First Non-Repeated Element: " + firstNonRepeated);
            } else {
                System.out.println("No non-repeated element found.");
            }
        }
    }


