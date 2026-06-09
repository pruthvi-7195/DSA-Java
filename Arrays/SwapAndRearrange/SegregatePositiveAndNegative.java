/*
Problem: Segregate Positive and Negative Numbers

Move all negative numbers to the left
and positive numbers to the right.

Approach:
Two Pointer Technique

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Arrays;

public class SegregatePositiveAndNegative {

    public static void segregate(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (left < right && arr[left] < 0) {
                left++;
            }

            while (left < right && arr[right] >= 0) {
                right--;
            }

            if (left < right) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3};

        segregate(arr);

        System.out.println(Arrays.toString(arr));
    }
}
