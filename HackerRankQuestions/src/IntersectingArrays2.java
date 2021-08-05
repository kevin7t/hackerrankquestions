import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class IntersectingArrays2 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 8, 8, 7, 6, 5};
        int[] nums2 = {1, 1, 2, 2, 4, 4, 8, 8, 7, 9};
        ArrayList<Integer> result = new ArrayList<>();

        /**
         * Find what is intersecting, e.g result should be 2,2
         * as there is 2 in both, and 2 in both again
         *
         * Point 1, if its unsorted, itll take more effort to find all
         * Point 2, we would want to start reading from the shortest array first
         * Point 3, space complexity? what if we dont want to use a hashmap
         */

        /**
         * Method
         * Dual pointers
         * Sort both arrays first
         * Both starting at beginning of arrays
         * We compare first to second array, if the second array less than first element
         * then we increase the second arrays pointer (j)
         *
         * if second value is greater than first, then we increase the first array pointer (i)
         *
         * if both are the same we will add this value to new array and also increase both pointers at the same time
         */

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            }
            if (nums1[i] < nums2[j]) {
                i++;
            }
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            }
        }
        System.out.println(result.toString());
    }
}