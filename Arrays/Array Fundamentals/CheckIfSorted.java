/*
Problem: Check if Array is Sorted

Determine whether the array is sorted
in ascending order.

Approach:
Compare every element with its next element.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class CheckIfSorted {

    public static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
      }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        if (isSorted(arr)) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Not Sorted");
        }
    }
}
