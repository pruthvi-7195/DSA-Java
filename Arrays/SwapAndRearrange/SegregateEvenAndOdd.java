/*
Problem: Segregate Even and Odd Numbers

Move all even numbers to the left side
and all odd numbers to the right side.

Approach:
Two Pointer Technique

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Arrays;

public class SegregateEvenAndOdd {

    public static void segregate(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            while (left < right && arr[right] % 2 != 0) {
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

        int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};

        segregate(arr);

        System.out.println(Arrays.toString(arr));
    }
}
