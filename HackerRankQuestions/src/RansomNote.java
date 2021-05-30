import java.util.*;

class RansomNote {
    public static void main(String[] args) {
        List<String> magazine = new ArrayList<>();
        List<String> note = new ArrayList<>();

//        give me one grand today night
//        give one grand today
        String[] array = {"o", "l" ,"x" ,"imjaw" ,"bee" ,"khmla" ,"v"  ,"o" ,"v" ,"o" ,"imjaw" ,"l" ,"khmla" ,"imjaw" ,"x"};
        magazine.addAll(Arrays.asList(array));

        String[] array2 = {"imjaw", "l", "khmla", "x", "imjaw", "o" ,"l", "l" ,"o", "khmla" ,"v" ,"bee" ,"o" ,"o", "imjaw", "imjaw" ,"o"};
        note.addAll(Arrays.asList(array2));

        Hashtable<String, Integer> hashtable = new Hashtable(magazine.size());
        for (String s : magazine) {
            if (hashtable.get(s) != null) {
                Integer amount = hashtable.get(s);
                amount++;
                hashtable.put(s, amount);
            } else {
                hashtable.put(s, 1);
            }
        }

        Boolean answer = true;

        for (String s : note) {
            //Looks like hashtable contains is much different from hashtable get
            if (hashtable.get(s) == null) {
                answer = false;
            } else {
                Integer amount = hashtable.get(s);
                if (amount == 0) {
                    answer = false;
                    continue;
                }
                amount--;
                hashtable.put(s, amount);
            }
        }
        if (answer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}