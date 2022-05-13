package com.home.leetcode.week2;

import java.util.HashMap;
import java.util.Map;

/*
    Question:
        Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
        Each letter in magazine can only be used once in ransomNote.
    Link:
        https://leetcode.com/problems/ransom-note/

 */
public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";

        boolean canConstruct = canConstruct(ransomNote, magazine);
        System.out.println(canConstruct);
    }

    static boolean canConstruct(String ransomNote, String magazine){
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            int newCount = map.getOrDefault(ch, 0) - 1;

            if(newCount < 0){
                return false;
            }
            map.put(ch, newCount);
        }

        return true;
    }
}
