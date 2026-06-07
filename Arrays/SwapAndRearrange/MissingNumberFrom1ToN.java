/*
Problem: Missing Number from 1 to N

Given an array containing numbers from
1 to N with one number missing,
find the missing number.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MissingNumberFrom1ToN {

    public static int findMissing(int[] arr, int n) {

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};

        System.out.println(
                "Missing Number: "
                + findMissing(arr, 5)
        );
    }
}
