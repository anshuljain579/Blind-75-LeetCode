package com.home.leetcode.week3;

import java.util.HashSet;
import java.util.Set;

/*
    Link:
        https://leetcode.com/problems/contains-duplicate/
    Questions:
        Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.


 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        boolean haveDuplicate = checkDuplicate(nums);
        System.out.println(haveDuplicate);
    }

    static boolean checkDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
