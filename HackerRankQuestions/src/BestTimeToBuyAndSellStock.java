public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int profit = 0;

        //Loop through prices using i
        int i = 0;
        while (i < prices.length - 1) {
            //Find the first valleys, if our search is < prices.length - 1 and also if current element < next element
            //increment the pointer while the price of the current element is greater than the next, therefore putting us in a descend
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                System.out.println("Valley: current price is " +  prices[i] + " comparison price is greater than current : " + prices[i + 1]);
                i++;
            }
            System.out.println("Valley: found is " +  prices[i]);

            int valley = prices[i];


            //Find the peaks after finding the valleys, if our search is < prices.length - 1 and also if current element > next element
            //increment the pointer while the price of the current pointer is less than the next, therefore we are ascending to find the highest before it goes back down
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                System.out.println("Peak: current price is " +  prices[i] + " comparison price is less than current : " + prices[i + 1]);
                i++;
            }

            System.out.println("Peak: found is " +  prices[i]);

            int peak = prices[i];

            //Increment profit
            profit += peak - valley;
        }

        System.out.println(profit);
    }
}
