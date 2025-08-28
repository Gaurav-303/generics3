package arraylist;

import java.util.ArrayList;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List: " + list);


        int left = 0;
        int right = list.size() - 1;

        while (left < right) {

            Integer temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }

        System.out.println("Reversed List: " + list);
    }
}

