package com.home.leetcode.week2;

import java.util.HashSet;
import java.util.Set;

/*
    Question:
        Given a string s which consists of lowercase or uppercase letters,
        return the length of the longest palindrome that can be built with those letters.
        Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
    Link:
        https://leetcode.com/problems/longest-palindrome/
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";

        int longestPalindrome = getLongestPalindrome(s);
        System.out.println(longestPalindrome);
    }

    static int getLongestPalindrome(String s){
        if(s.length() == 0 || s == null) return 0;

        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }
        int odd = set.size();
        return s.length() - ( odd == 0 ? 0 : odd -1);
    }
}
