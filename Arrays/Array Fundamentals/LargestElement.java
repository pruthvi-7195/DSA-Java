/*
Problem: Largest Element in Array

Given an array of integers,
find the largest element.

Approach:
Traverse the array and keep track
of the maximum element found.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class LargestElement {

    public static int findLargest(int[] arr) {

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 34};

        System.out.println("Largest Element: "
                + findLargest(arr));
    }
}
