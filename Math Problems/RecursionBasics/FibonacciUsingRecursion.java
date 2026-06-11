/*
Problem: Fibonacci Series Using Recursion

Series:
0 1 1 2 3 5 8 13 ...

F(n) = F(n-1) + F(n-2)

Time Complexity: O(2^n)
Space Complexity: O(n)
*/

public class FibonacciUsingRecursion {

    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1)
                + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int terms = 10;

        for (int i = 0; i < terms; i++) {

            System.out.print(
                    fibonacci(i) + " "
            );
        }
    }
}
