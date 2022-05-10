package com.home.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
    Question:
        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     Link:
        https://leetcode.com/problems/two-sum/

 */
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = getTwoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getTwoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int result[] = new int[2];

        for(int i=0; i < nums.length; i++){
            int num = target - nums[i];

            if(map.containsKey(num)){
                result[1] = i;
                result[0] = map.get(num);
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
