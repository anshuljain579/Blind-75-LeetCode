package com.home.leetcode.week6;
/*
    Link:
        https://leetcode.com/problems/unique-paths/
 */
public class UniquePaths {
    public static void main(String[] args) {
        int m=3;
        int n=3;

        int uniquePath = getUniquePath(m, n);
        System.out.println(uniquePath);
    }

    public static int getUniquePath(int m, int n){
        if(m <= 1 || n <= 1){
            return 1;
        }

        //arrays to store result
        int[][] dp = new int[m][n];

        //first fill row with 1 and column with 0
        for(int i=0; i < m; i++){
            dp[i][0] = 1;
        }

        //fill first column with 1 and row with 0
        for(int i=0; i < n; i++){
            dp[0][i] = 1;
        }

        for(int i=1; i < m; i++){
            for(int j=1; j < n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}
