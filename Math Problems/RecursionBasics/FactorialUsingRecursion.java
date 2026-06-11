/*
Problem: Factorial of a Number

n! = n × (n-1) × (n-2) ... × 1

Example:
5! = 120

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class FactorialUsingRecursion {

    public static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Factorial = "
                + factorial(n));
    }
}
