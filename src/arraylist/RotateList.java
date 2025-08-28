package arraylist;

import java.util.ArrayList;

public class RotateList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int k = 2;
        System.out.println("Original List: " + list);


        k= k % list.size();


        ArrayList<Integer> rotated = new ArrayList<>();


        for (int i = list.size() - k; i < list.size(); i++) {
            rotated.add(list.get(i));
        }

        for (int i = 0; i < list.size() - k; i++) {
            rotated.add(list.get(i));
        }

        System.out.println("Rotated List (Right by " + k + "): " + rotated);
    }
}
