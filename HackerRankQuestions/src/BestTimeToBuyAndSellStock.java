public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {1, 2, 7, 1, 7};
        int profit = 0;

        //Loop through prices using i
        int i = 0;
        while (i < prices.length - 1) {
            //Find the valleys, if our search is < prices.length - 1 and also if current element < next element
            //increment the pointer
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
                System.out.println("Valley: current price is " +  prices[i] + " comparison price is greater than current : " + prices[i + 1]);
            }
            System.out.println("Valley: found is " +  prices[i]);

            int valley = prices[i];


            //Find the peaks, if our search is < prices.length - 1 and also if current element > next element
            //increment the pointer
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                System.out.println("Peak: current price is " +  prices[i] + " comparison price is less than current : " + prices[i + 1]);
                i++;
            }

            System.out.println("Peak: found is " +  prices[i]);

            int peak = prices[i];

            //Increment profit profit+= peak - valley
            profit += peak - valley;
        }

        System.out.println(profit);
    }
}
