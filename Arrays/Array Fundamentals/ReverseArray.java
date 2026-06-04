/*
Problem: Reverse an Array

Reverse the given array in-place.

Approach:
Use two pointers:
one at the beginning and one at the end.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }
}
