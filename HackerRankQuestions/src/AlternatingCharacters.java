import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class AlternatingCharacters {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = "aaabbb";
        //return the amount of deletions
        //Remove consecutive letters
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}