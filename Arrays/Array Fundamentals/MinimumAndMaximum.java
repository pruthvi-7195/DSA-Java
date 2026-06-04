/*
Problem: Find Minimum and Maximum Element

Find both the minimum and maximum
elements in an array.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MinimumAndMaximum {

    public static void findMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);
    }

    public static void main(String[] args) {

        int[] arr = {15, 7, 25, 3, 40, 12};

        findMinMax(arr);
    }
}
