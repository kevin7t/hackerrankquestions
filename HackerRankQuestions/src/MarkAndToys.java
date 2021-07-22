import java.util.*;

class MarkAndToys {


    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(1, 12, 5, 111, 200, 1000, 10);
        int k = 50;
        Collections.sort(prices);
        List<Integer> purchases = new ArrayList<>();

        for (Integer price : prices) {
            if (k != 0 && k - price > 0 ) {
                k = k- price;
//                System.out.println("Balance left is"+ (k - price));
                purchases.add(price);
            }
        }
        System.out.println(purchases.size());

    }
}