/*
Problem: Count Occurrences of a Number

Count how many times a given number
appears in the array.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class CountOccurrences {

    public static int countOccurrences(int[] arr, int target) {

        int count = 0;

        for (int num : arr) {

            if (num == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 2, 6, 2, 8, 2};
        int target = 2;

        System.out.println(
                "Occurrences: "
                + countOccurrences(arr, target)
        );
    }
}
