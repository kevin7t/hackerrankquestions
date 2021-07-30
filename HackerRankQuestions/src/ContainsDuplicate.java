import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4};
        System.out.println(containsDuplicates(nums));
    }

    private static boolean containsDuplicates(int[] nums) {
        //Using a set is O(n) space complexity
        //Add and searching in a set is also O(N) time complexity
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)){
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
