package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int[][] arr = {  {0, -4, -6, 0, -7, -6},
                            {-1, -2, -6, -8, -3, -1},
                            {-8, -4, -2, -8, -8, -6},
                            {-3, -1, -2, -5, -7, -4},
                            {-3, -5, -3, -6, -6, -6},
                            {-3, -6, 0, -8, -6, -7}
                         };

    // Complete the hourglassSum function below.
    static int hourglassSum() {
        int[][] maxArray = new int[3][3];
        int maxResult = -1234710;       // 대,소 비교를 위해 초기 최대값을 셋팅해줘야하는데.. 더 좋은 값이 없을까

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (maxResult < sum) {
                    maxResult = sum;
                }
            }
        }

        return maxResult;
    }

    public static void main(String[] args) {
        int result = hourglassSum();

        System.out.println("result : " + result);
    }
}

