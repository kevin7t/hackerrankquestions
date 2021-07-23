import java.util.*;
import java.util.Comparator;

public class FraudulentActivityNotifications {

    //TODO This solution is not optimised, fails test case for large arrays

    public static void main(String[] args) {
        //We need to get sub array of n
        //2 3 4 2 3 6 8 4 5
        //For example for 5 days we have 2 3 4 2 3
        //The median of this is 3 (Create method to find median of array)
        //if 2X median is greater or equal than the value for day 6 (6) then we need to send out a notification
        //Otherwise dont send notification
        /**
         * Notes we only look at the previous 5 days of the current day, for example
         * this loop starts at 6, as we can have minimum 5 days history from day 6
         *
         * There needs to be a counter of how many notifications sent
         *
         */

        int[] array = {10, 20, 30, 40, 50};
        int days = 3;
        int notification = 0;
        //We need to start on array[days] as this is 5 prior, hence the 6th element
        //Look back at array[0] to array[days -1] and find the median
        //Calculate 2x median and if it is greater than the arrays[days] element then we have issue, else move on +

        if (array.length > (days + 1)) {
            for (int i = days; i < array.length; i++) {
                //Needs to be current index minus days
                int startIndex = i - days;
                if (startIndex < 0) {
                    break;
                }
                int endIndex = startIndex + (days - 1);
                if (2 * findMedianFromArraylist(Arrays.copyOfRange(array, startIndex, endIndex)) > array[i]) {
                    notification++;
                }
            }
        }
        System.out.println(notification);
    }

    public static int findMedianFromArraylist(int[] array) {
        Arrays.sort(array);
        int size = array.length;

        return array[size / 2];
    }
}
