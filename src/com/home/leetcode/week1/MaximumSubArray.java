package com.home.leetcode.week1;

/*
        Question:
            Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
            A subarray is a contiguous part of an array.

        Link:
            https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};

        int maxSubArray = getMaxSubArray(arr);
        System.out.println(maxSubArray);
    }

    public static int getMaxSubArray(int [] arr){
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for(int num : arr){
            max_ending_here += num;

            max_so_far = Math.max(max_ending_here, max_ending_here);
            if(max_ending_here < 0){
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
}
