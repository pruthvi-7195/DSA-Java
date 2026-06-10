/*
Problem: Prime Number Check

A prime number has exactly
two factors: 1 and itself.

Time Complexity: O(√n)
Space Complexity: O(1)
*/

public class PrimeNumber {

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 29;

        if (isPrime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }
}
