import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class PlusOne {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] ints = {9};
        int[] digits = {1,9,9,9};
        //Input of 9 should outpput [1,0]

        /**
         * Numbers in the array represent the number e.g [1,2,3] is one hundred and twenty three
         * Output must add 1 to the number, resulting in one hundred and twenty four
         * we must detect that if we come across a 9 then we need to carry it over
         */

        //Iterate backwards in arraylist, if result == 10, then set it to 0 and carry one to next iteration
        //199 becomes 991
        //add the 1 to the 9, we get 10
        //this set first element to 0 and carry the 1 - 091
        //we then add the 1 back on and then we get 001
        //we then add the 1 on and we get 002
        //reverse the array and we get 200

        //If we get single digit e.g 9, we then need to carry over and detect this is last value, e.g next is null
        int carryover = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int anInt : digits) {
            arrayList.add(anInt);
        }
        Collections.reverse(arrayList);
        int size = arrayList.size();
        for (int i = 0; i< size; i ++) {
            int sum = 0;
            //For the first element we need to add 1
            if (i == 0){
                sum = arrayList.get(i) + 1;
            } else if (carryover > 0) {
                //If there is a carry over then we must add to the next number
                sum = arrayList.get(i) + carryover;
            } else{
                //Else the number stays as is
                sum = arrayList.get(i);
            }

            //If we have a sum of 10, then there must be a carry over of 1,
            if (sum >= 10 ){
                carryover = sum - 9;
                arrayList.set(i , 0);
            } else {
                carryover = 0;
                arrayList.set(i , sum);
            }
            if (i + 1 == size &&  carryover > 0){
                arrayList.add(carryover);
            }
        }
        Collections.reverse(arrayList);
        int[] result = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }

        System.out.println(arrayList);
    }
}