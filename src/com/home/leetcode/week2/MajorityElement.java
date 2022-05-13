package com.home.leetcode.week2;

import java.util.HashMap;
import java.util.Map;

/*
    Question:
        Given an array nums of size n, return the majority element.
        The majority element is the element that appears more than ⌊n / 2⌋ times.
        You may assume that the majority element always exists in the array.
    Link:
        https://leetcode.com/problems/majority-element/
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int majorityElement = getMajorityElement(nums);
        System.out.println(majorityElement);
    }

    public static int getMajorityElement(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if(map.get(nums[i]) > nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}
