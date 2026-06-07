/*
Problem: Left Rotate Array by One Position

Input:
[1,2,3,4,5]

Output:
[2,3,4,5,1]

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Arrays;

public class LeftRotateByOne {

    public static void rotate(int[] arr) {

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        rotate(arr);

        System.out.println(Arrays.toString(arr));
    }
}
