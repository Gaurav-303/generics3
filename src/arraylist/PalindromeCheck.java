package arraylist;

import java.util.ArrayList;

public class PalindromeCheck {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('r');
        list.add('a');
        list.add('d');
        list.add('a');
        list.add('r');

        if (isPalindrome(list)) {
            System.out.println("The ArrayList is a palindrome.");
        } else {
            System.out.println("The ArrayList is not a palindrome.");
        }
    }

    public static boolean isPalindrome(ArrayList<Character> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (list.get(left) != list.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
