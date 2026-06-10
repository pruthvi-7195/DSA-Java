/*
Problem: Print Prime Numbers from 1 to N

Approach:
Sieve of Eratosthenes

Time Complexity: O(n log log n)
Space Complexity: O(n)
*/

public class PrimeNumbersUsingSieve {

    public static void sieve(int n) {

        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {

            if (isPrime[i]) {

                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Prime Numbers:");

        for (int i = 2; i <= n; i++) {

            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        sieve(50);
    }
}
