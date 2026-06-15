/*
Problem: Element with Maximum Frequency

Find the element occurring
the maximum number of times.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

public class ElementWithMaximumFrequency {

    public static int maxFrequencyElement(int[] arr) {

        HashMap<Integer,Integer> map =
                new HashMap<>();

        for(int num : arr) {

            map.put(
                num,
                map.getOrDefault(num,0) + 1
            );
        }

        int maxFreq = 0;
        int answer = -1;

        for(int key : map.keySet()) {

            if(map.get(key) > maxFreq) {

                maxFreq = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,2,4,4};

        System.out.println(
            "Element with Maximum Frequency: "
            + maxFrequencyElement(arr)
        );
    }
}
