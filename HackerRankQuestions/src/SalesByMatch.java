package com.kt;

import java.util.*;

class SalesByMatch {
    //-----Task------
    //There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
    //There is one pair of color 1 and one of color 2 . There are three odd socks left, one of each color. The number of pairs is 2
    //[1,2,1,2,1,3,2]


    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        List<Integer> stringList = new ArrayList<>();
//        for (int i = 1; i <=7; i++ ){
//            System.out.println("Enter number:  " + i);
//            stringList.add(Integer.valueOf(scanner.next()));
//        }
//        System.out.println("You have entered: ");
//        for (int i = 0; i <7; i++ ){
//            System.out.print(stringList.get(i));
//        }

        List<Integer> stringList = new ArrayList<>();
        stringList.addAll(List.of(1, 2, 1, 2, 1, 3, 2));

        // Begin logic
        //First we need to sort out duplicates, therefore we need to use a Set as this cannot hold duplicates
        Set<Integer> socks = new HashSet<>();

        //We also need a counter to count the pairs of socks
        Integer pairs = 0;

        for (Integer sock : stringList) {
            //If the set contains the sock already and we have another one, we then say it is a pair and remove it from the set
            if (socks.contains(sock)) {
                socks.remove(sock);
                pairs++;
            } else {
                //For singular socks we just add them to the set
                socks.add(sock);
            }
        }
        System.out.println("Amount of pairs of socks: " + pairs);
    }
}