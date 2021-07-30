import java.util.Scanner;

class RotateArray {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 9;
//        int[] nums = {-1, -100, 3, 99};
//        int k = 1;

        int[] rotatedArray = rotateArray2(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(rotatedArray[i]);
        }
    }

    public static int[] rotateArray(int[] nums, int k) {
        //Checking if array is greater than 1 otherwise
        if (nums.length > 1) {
            //If k greater than array length then overlap by doing MOD
            if (k > nums.length) {
                k = k % nums.length;
            }
            int startRead = nums.length - k;
            int count = 0;
            int[] rotatedArray = new int[nums.length];

            for (int i = startRead, j = 0; i <= nums.length - 1; i++, j++) {
                rotatedArray[j] = nums[i];
                //Using a counter here to continue the other side of the rotation
                count++;
            }

            for (int i = 0, j = count; i < startRead; i++, j++) {
                rotatedArray[j] = nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = rotatedArray[i];
            }
        }
        return nums;
    }
    public static int[] rotateArray2(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            //To do modulus array rotation
            //index + rotational amount MOD length of array will result in the element that is rotated
            //e.g if we want to shift 3 to the right,
            //we add 3 to the index, e.g the first array is 0, + 3 and MOD 7 will result in first array moving straight to 3
            //Once we reach the 4th array, which is 4+3 MOD 7 then that will bring us to the zeroth index
            int pos = (i + k) % nums.length;
            a[pos] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
        return nums;
    }
}