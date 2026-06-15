/*
Problem: Count Frequency of Each Element

Count how many times each element
appears in the array.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

public class CountFrequencyOfEachElement {

    public static void countFrequency(int[] arr) {

        HashMap<Integer,Integer> map =
                new HashMap<>();

        for(int num : arr) {

            map.put(
                num,
                map.getOrDefault(num,0) + 1
            );
        }

        System.out.println(map);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,1,4,2};

        countFrequency(arr);
    }
}
