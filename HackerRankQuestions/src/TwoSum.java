import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     */

    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        int[] nums = {3, 2, 4};
//        int target = 6;
        int[] nums = {3, 3};
        int target = 6;

        /**
         * First we want to record numbers into hash map
         * 2nd pass we could do target - element and then search for the answer in the hashmap
         *
         * 1. Is there a way to do this in one pass? - yes, run a for loop and add to hashmap if we dont come across it
         * 2. We need to return the element index rather than the numbers themselves - hashmap, record the index
         * 3. If we get target 6 and first value is 3, we cant find another value, e.g if target = element is same as element, not allowed
         *    we can solve this by if we just have hashmap contains key, means that its already found therefore we can just return the current element and the answer
         */
        HashMap<Integer, Integer> hashMap = new HashMap<>();


        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            int answer = target - nums[i];
            //If the answer is found in the hashmap, then we can return the result as we have recorded it before
            if (hashMap.containsKey(answer)) {
                result[0] = hashMap.get(answer);
                result[1] = i;
                break;
            } else {
                hashMap.put(nums[i], i);
            }
        }
        System.out.println(result);

    }
}
