/*
Problem: Check for Duplicates

Determine whether an array contains
duplicate elements.

Approach:
Use HashSet.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashSet;

public class CheckDuplicates {

    public static boolean hasDuplicates(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 2};

        if (hasDuplicates(arr)) {
            System.out.println("Duplicates Found");
        } else {
            System.out.println("No Duplicates");
        }
    }
}
