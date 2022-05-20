package com.home.leetcode.week3;

import java.util.HashSet;
import java.util.Set;

/*
    Question:
        Given a string s, find the length of the longest substring without repeating characters.
    Link:
        https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringUniqueCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";

        int lengthOfLongestSubString = getLengthOfLongestSubString(s);
        System.out.println(lengthOfLongestSubString);
    }

    static int getLengthOfLongestSubString(String s){
        int i=0;
        int j=0;
        int max = 0;

        Set<Character> set = new HashSet<>();
        while( j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                max = Math.max(set.size(), max);
                j++;
            }
            else{
                set.remove(s.charAt(j));
                i++;
            }
        }
        return max;
    }
}
