/*
Problem: Sum of Array Elements

Find the sum of all elements in an array.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class SumOfArrayElements {

    public static int findSum(int[] arr) {

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Sum = " + findSum(arr));
    }
}
