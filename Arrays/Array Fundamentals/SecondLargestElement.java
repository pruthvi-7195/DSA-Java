/*
Problem: Second Largest Element in Array

Find the second largest distinct element
in the array.

Approach:
Maintain largest and second largest values.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class SecondLargestElement {

    public static int findSecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {

                secondLargest = largest;
                largest = num;
              
            } else if (num > secondLargest
                    && num != largest) {

                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 15, 40, 35};

        System.out.println("Second Largest Element: "
                + findSecondLargest(arr));
    }
}
