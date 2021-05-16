import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sockMerchant {
    public static void main(String[] args) {
        /*
         * Complete the 'sockMerchant' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. INTEGER_ARRAY ar
         */
        List<Integer> ar = new ArrayList<>();
        ar.addAll(List.of(10,20,20,10,10,30,50,10,20));
        System.out.println(sockMerchant(9, ar));
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        //Begin with no pairs of socks
        int pairs = 0;
        //Set cannot hold duplicates therefore use a set here
        Set<Integer> socks = new HashSet();

        for (int i = 0; i < n; i++){
            Integer val = ar.get(i);
            //If the set does not contain then we add it in as its first entry
            if (!socks.contains(val)){
                socks.add(val);
            } else {
                //Once we know that the sock has a duplicate we then remove it, we dont want to add this duplicate in, we also want to remove it, incase
                //we come across a sock with this key again we can re use it
                //and increase the counter for pairs
                socks.remove(val);
                pairs++;
            }
        }
        return pairs;

    }
}
