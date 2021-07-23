import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {
    public static void main(String[] args) {
        //two Strings
        //Output the amount of characters to delete

        //Use a hashmap?
        //Store character of first string
        //Start storing characters of second string
        //If second string has character of first string, decrement its value
        //Return amount of characters to delete to make both strings the same
        String first = "cc";
        String second = "ccce";
        HashMap<Character, Integer> dictionary = new HashMap<>();

        //Count all strings in first one
        for (int i = 0; i < first.length(); i++) {
            Character character = first.charAt(i);

            int num = dictionary.containsKey(character) ? dictionary.get(character) : 0;
            dictionary.put(character, num + 1);

        }

        //If second contains same character as first string then remove it, leaving us with the ones to remove (count them)
        for (int i = 0; i < second.length(); i++) {
            Character character = second.charAt(i);
            int num = dictionary.containsKey(character) ? dictionary.get(character) : 0;
            dictionary.put(character, num - 1);
        }

        //Iterate through the hashmap and if value is greater than 1 , sum up a list
        //There is a possibility that first is "cc" and second has "ccce"
        //Therefore we get -1, therefore we need to get the absolute value using Math.abs to say we need to remove 1 c from second
        Integer sumToRemove = 0;
        for (Map.Entry<Character, Integer> characterIntegerEntry : dictionary.entrySet()) {
            sumToRemove += Math.abs(characterIntegerEntry.getValue());
        }
        System.out.println(sumToRemove);
    }
}
