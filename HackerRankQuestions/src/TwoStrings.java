import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class TwoStrings {


    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(twoStrings("op","lop"));
    }

    public static String twoStrings(String s1, String s2){
        //When we want to determine if "substring" exists in both, if we was to compare char by char, the max shared between
        //The two strings will be one character
        //We can then use the alphabet and loop through, both strings contain the same character, then we can return yes
        //This stops us brute forcing s1 if s1 happens to too many characters s2 does not have, it will take ages
        for (char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            if (s1.contains(Character.toString(c)) && s2.contains(Character.toString(c))){
                return "YES";
            }
        }
        return "NO";

    }
}