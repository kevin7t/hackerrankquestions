import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MoveZeros {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] digits = {1,0,9,0,2};
        //Iterate through the array
        for (int i = 0; i < digits.length; i++) {
            //If we come across a zero
            if (digits[i] == 0){
                //Use a second run to find the first non zero
                for (int j = i; j < digits.length; j++) {
                    //Swap the two
                    if (digits[j] != 0){
                        //swap digit i with digit j
                        int temp = digits[i];
                        digits[i] = digits[j];
                        digits[j] = temp;
                        //Break out of this inner for loop as we already swapped, therefore we need the next i
                        break;
                    }
                }
            }
        }
        for (int digit : digits) {
            System.out.println(digit);
        }
    }
}