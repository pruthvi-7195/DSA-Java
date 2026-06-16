/*
Problem: Contains Duplicate

Return true if any value appears
at least twice in the array.

Example:
[1,2,3,1] -> true

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {

            if(set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,1};

        System.out.println(
                containsDuplicate(nums)
        );
    }
}
