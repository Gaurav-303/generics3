package arraylist;

import java.util.ArrayList;

public class CustomSortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(7);

        System.out.println("Before Sorting: " + list);

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        System.out.println("After Sorting (Ascending): " + list);
    }
}

