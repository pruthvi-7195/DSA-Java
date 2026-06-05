/*
Problem: First Repeating Element

Find the first element that repeats
in the array.

Example:
Input: {10, 5, 3, 4, 3, 5, 6}
Output: 5

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashSet;

public class FirstRepeatingElement {

    public static int firstRepeating(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        int firstRepeating = -1;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (set.contains(arr[i])) {
                firstRepeating = arr[i];
            }

            set.add(arr[i]);
        }

        return firstRepeating;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        int result = firstRepeating(arr);

        if (result != -1) {
            System.out.println(
                    "First Repeating Element: "
                    + result
            );
        } else {
            System.out.println(
                    "No Repeating Element Found"
            );
        }
    }
}
