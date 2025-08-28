package arraylist;

import java.util.ArrayList;

public class RemoveDuplicates {
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

        ArrayList<Integer> uniqueList = new ArrayList<>();


        for (Integer num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        System.out.println("Original List: " + list);
        System.out.println("After Removing Duplicates: " + uniqueList);
    }
}

