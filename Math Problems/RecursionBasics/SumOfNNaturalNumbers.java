/*
Problem: Sum of N Natural Numbers

Find the sum of first N natural numbers
using recursion.

Example:
n = 5

1 + 2 + 3 + 4 + 5 = 15

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class SumOfNNaturalNumbers {

    public static int sum(int n) {

        if (n == 1) {
            return 1;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Sum = " + sum(n));
    }
}
