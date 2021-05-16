import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here

        // i is the rows, go across
        // j is the columns, go down

        //First row i, get three, j and j+ 1 and j+2
        //Second row i+1, get j + 1
        //Bottom row i+2, get three j + j + 1 and J + 2
        Integer maxHourglass = 0;
        for (int i = 0; i< arr.get(0).size(); i++){
            for(int j = 0; j < arr.size(); j ++){
                if(i+2 < arr.size() && j+2 < arr.get(i).size()){
                    //System.out.println("First row: " +Math.abs(arr.get(i).get(j)+ arr.get(i).get(j+1) + arr.get(i).get(j+2)));
                    //System.out.println("Second row: " +arr.get(i+1).get(j+1));
                    //System.out.println("First row: " +Math.abs(arr.get(i+2).get(j)+ arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2)));


                    Integer sum = arr.get(i).get(j)+ arr.get(i).get(j+1) + arr.get(i).get(j+2);
                    sum += arr.get(i+1).get(j+1);
                    sum += arr.get(i+2).get(j)+ arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                    System.out.println("Total hourglass sum is: " + sum);

                    if (sum > maxHourglass){
                        maxHourglass = sum;
                    }
                }

            }
        }
        return maxHourglass;
    }
}

public class twoDarrayDS {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
