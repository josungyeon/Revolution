package hackerrank;

import java.io.*;
import java.util.*;
/**
 * (
 * Sample input :
 * 7 50
 * 1 12 5 111 200 1000 10
 *
 * Sample output :
 * 4
 */
public class MaximumToys {

    // todo.. 해결점은 이중 for loop 뿐인가..
    static int maximumToys(int[] prices, int k) {
        // sorting
        int size = prices.length;
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (prices[j] > prices[j+1]) {
                    int tmp = prices[j+1];
                    prices[j+1] = prices[j];
                    prices[j] = tmp;
                }
            }
        }

        int index = 0;
        int totalPrice = 0;
        while(totalPrice < k) {
            totalPrice += prices[index];
            index++;
        }

        return index - 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
