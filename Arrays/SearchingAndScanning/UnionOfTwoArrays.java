/*
Problem: Union of Two Arrays

Find the union of two arrays.
Union contains all distinct elements
from both arrays.

Approach:
Use HashSet.

Time Complexity: O(n + m)
Space Complexity: O(n + m)
*/

import java.util.HashSet;

public class UnionOfTwoArrays {

    public static void union(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        System.out.println("Union: " + set);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        union(arr1, arr2);
    }
}
