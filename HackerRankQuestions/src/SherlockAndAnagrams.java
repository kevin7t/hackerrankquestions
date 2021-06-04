import java.util.*;

class SherlockAndAnagrams {


    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = "cdcd";
//        this should have [c c] [d d] [cd dc ] [cd cd] [dc cd ]

//
//        First we need to find all sub strings of first, from 0th to length
//        Then record all the substrings into a hashmap, ordered?
//        Then count the sub strings from the total anagrams and return values if found a pair
        int results = 0;
        HashMap<String, Integer> mapOfSubstrings = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                char array[] = substring.toCharArray();
//                Arrays.sort(array);
                String orderedSubString = String.valueOf(array);
                if (orderedSubString != "") {
                    if (mapOfSubstrings.get(orderedSubString) != null) {
                        mapOfSubstrings.put(orderedSubString, mapOfSubstrings.get(orderedSubString) + 1);
                    } else {
                        mapOfSubstrings.put(orderedSubString, 1);
                    }
                }
            }
        }
        //count the pairs from the hashmap
        for (Map.Entry<String, Integer> entry : mapOfSubstrings.entrySet()) {
            if (entry.getValue() > 1) {
                results++;
            }
        }
        System.out.println(results);

    }


}