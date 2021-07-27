import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SherlockAndTheValidString {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Testing valid string: aabbc");
        System.out.println(isValid("abbbjjjhhh"));


    }

    public static boolean isValid(String s) {
        //String is valid if we can remove 1 character where there is a character that appears twice
        //If all characters still appear once then is valid
        Boolean pass = false;
//        if (s.length() == 1 || s.length() == 0){
//            return "YES";
//        }

        //Condition 1: string has 1 lot of each character, e.g map values are all 1

        //Condition 2: if e.g abccc is entered, remove a c and we get 1a 1b and 2c 

        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> characterHashSet = new HashMap<>();
        for (char c : charArray) {
            Integer frequency = characterHashSet.get(c) != null ? characterHashSet.get(c) + 1 : 1;
            characterHashSet.put(c, frequency);
        }

        //Need to find the different values
        //We only allow tolerance of +1, if we get > 1 then we fail
        Integer min = Collections.min(characterHashSet.values());
        Integer max = Collections.max(characterHashSet.values());

        Integer maxFreq = Collections.frequency(characterHashSet.values(), max);
        Integer minFreq = Collections.frequency(characterHashSet.values(), min);

        Integer amountDiffMax = characterHashSet.size() - maxFreq;
        Integer amountDiffMin = characterHashSet.size() - minFreq;

        //There can be only one difference, lets say there are 8 characters
        //Minimum frequency we should have 7, therefore if we find the difference we should expect 1
        //as that is the tolerance we allow
        if (amountDiffMax == 1 || amountDiffMin == 1) {
            pass = true;

            //There is just frequency of 1 for max or min
            //We then have a sub condition where if the min frequency is NOT 1 fre, e.g 1,1,1,5
            //We then need to calculate the difference due as example has difference of 4
            //If min frequency is 1, then e.g we have 1,3,3,3
            //then this is allowed as we are able to remove 1 to make 3,3,3 pass therefore pass this condition
            if (minFreq != 1){
                Integer diff = Math.abs(max - min);
                if (diff > 1) {
                    pass = false;
                }
            }
        } else {
            //If lets say we have 4,4,4,4,4 then amount diff is 0 and also min max diff is 0

            //Also if we have 2,2,4,4 then the min max diff will be greater than 1

            //Second condition, we cant have diff of max - min of 2
            Integer diff = Math.abs(max - min);
            if (diff == 0) {
                pass = true;
            } else if (diff > 1) {
                pass = false;
            }
        }

//

        return pass;
    }
}