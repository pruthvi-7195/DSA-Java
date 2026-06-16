/*
Problem: Intersection of Two Arrays

Return unique elements that appear
in both arrays.

Example:
a = [1,2,2,1]
b = [2,2]

Output:
[2]

Time Complexity: O(n + m)
Space Complexity: O(n)
*/

import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static void intersection(
            int[] nums1,
            int[] nums2) {

        HashSet<Integer> set1 =
                new HashSet<>();

        HashSet<Integer> result =
                new HashSet<>();

        for(int num : nums1) {
            set1.add(num);
        }

        for(int num : nums2) {

            if(set1.contains(num)) {
                result.add(num);
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {

        int[] a = {1,2,2,1};
        int[] b = {2,2};

        intersection(a,b);
    }
}
