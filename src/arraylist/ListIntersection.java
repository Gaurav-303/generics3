package arraylist;

import java.util.ArrayList;

public class ListIntersection {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(30);
        list2.add(40);
        list2.add(60);
        list2.add(70);
        list2.add(20);


        ArrayList<Integer> intersection = new ArrayList<>();

        for (Integer num : list1) {
            if (list2.contains(num) && !intersection.contains(num)) {
                intersection.add(num);
            }
        }


        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Intersection: " + intersection);
    }
}

