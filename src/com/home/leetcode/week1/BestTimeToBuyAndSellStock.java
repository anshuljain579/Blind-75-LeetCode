package com.home.leetcode;

/*
        Questions:
            You are given an array prices where prices[i] is the price of a given stock on the ith day.
            You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
            Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
        Link:
            https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};

        int maxProfit = getMaxProfit(nums);
        System.out.println(maxProfit);
    }

    static int getMaxProfit(int[] nums){
        int buy = Integer.MAX_VALUE;
        int sell = Integer.MIN_VALUE;

        for(int num : nums){
            buy = Math.min(buy, num);
            sell = Math.max(sell, num-buy);
        }

        return sell;
    }
}
