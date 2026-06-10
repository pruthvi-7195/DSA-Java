/*
Problem: Armstrong Number

A number is Armstrong if the sum of its digits
raised to the power of the number of digits
equals the number itself.

Example:
153 = 1³ + 5³ + 3³

Time Complexity: O(d)
Space Complexity: O(1)
*/

public class ArmstrongNumber {

    public static boolean isArmstrong(int num) {

        int original = num;
        int digits = String.valueOf(num).length();

        int sum = 0;

        while (num > 0) {

            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        int num = 153;

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }
    }
}
