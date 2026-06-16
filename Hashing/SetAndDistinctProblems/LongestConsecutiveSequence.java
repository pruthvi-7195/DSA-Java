/*
Problem: Longest Consecutive Sequence

Find the length of the longest
sequence of consecutive integers.

Example:
[100,4,200,1,3,2]

Output:
4

Sequence:
1,2,3,4

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(
            int[] nums) {

        HashSet<Integer> set =
                new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for(int num : set) {

            if(!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                while(set.contains(currentNum + 1)) {

                    currentNum++;
                    count++;
                }

                longest = Math.max(
                        longest,
                        count
                );
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] nums =
                {100,4,200,1,3,2};

        System.out.println(
                "Longest Sequence Length: "
                + longestConsecutive(nums)
        );
    }
}
