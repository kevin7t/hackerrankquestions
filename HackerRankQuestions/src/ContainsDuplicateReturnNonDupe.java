import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicateReturnNonDupe {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4};
        System.out.println(containsDuplicates(nums));
    }

    private static int containsDuplicates(int[] nums) {
        //return if a number is not a duplicate
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer frequency = map.containsKey(num) ? map.get(num) : 0;
            map.put(num, frequency + 1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() == 1){
                return integerIntegerEntry.getKey();
            }
        }
        return 0;
    }
}
