import java.util.*;

class Comparator {

    public static void main(String[] args) {


    }
    /**
     * Usually comparators if a>b then we return 1 for ascending sort
     * returning -1 if a<b
     * and if a==b then return 0
     * For this implementation we are doing the opposite
     * also the condition is that if the score is the same we then need to compare the name, in asc
     * hence when we do compareTo we will do a.name.compareTo(b.name) if a is higher than b then return value
     */

//    class Checker implements Comparator<Player> {
//        // complete this method
//        public int compare(Player a, Player b) {
//            // complete this method
//            public int compare(Player a, Player b) {
////    Decreasing descending comparator therefore opposite returning 1 instead of 0 for when a<b
//                if (a.score < b.score){
//                    return 1;
//                } else if ( a.score > b.score){
//                    return -1;
//                } else {
////                    if two of the same score then we need to compare the name in ascending
//                    return a.name.compareTo(b.name);
//                }
//            }
//        }
//    }
}