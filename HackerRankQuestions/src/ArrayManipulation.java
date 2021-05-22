package com.kt;

import java.lang.reflect.Array;
import java.util.*;

class ArrayManipulation {


    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<List<Integer>> queue = new ArrayList<>();
        queue.add(Arrays.asList(1,5,3));
        queue.add(Arrays.asList(4,8,7));
        queue.add(Arrays.asList(6,9,1));

        int n = 10;

        long[] array = new long[n];

        for (List<Integer> integers : queue) {
            int start = integers.get(0);
            int end = integers.get(1);
            int amount = integers.get(2);
            //for start to end, add amount to the array

            for (int i = start-1; i<= end-1; i++ ) {
                array[i] += amount;
            }
            System.out.println(array.toString());
        }
        System.out.println(Arrays.stream(array).max().getAsLong());
    }
}