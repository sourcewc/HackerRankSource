import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Result {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        float countPlus = 0;
        float countMinus = 0;
        float countZero = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                countPlus++;
            } else if (arr[i] < 0) {
                countMinus++;
            } else {
                countZero++;
            }
        }

        System.out.println(String.format("%.6f",countPlus/arr.length));
        System.out.println(String.format("%.6f",countMinus/arr.length));
        System.out.println(String.format("%.6f",countZero/arr.length));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
