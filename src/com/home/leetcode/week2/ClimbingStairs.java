package com.home.leetcode.week2;

/*
    Questions:
        You are climbing a staircase. It takes n steps to reach the top.
        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
    Link:
        https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 3;

        int ways = climbStairs(n);
        System.out.println(ways);
    }

    static int climbStairs(int n){
        int [] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;

        if(n <= 1){
            return 1;
        }

        for(int i=3; i <= n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
