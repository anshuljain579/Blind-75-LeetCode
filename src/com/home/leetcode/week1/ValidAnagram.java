package com.home.leetcode.week1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
        Questions:
            Given two strings s and t, return true if t is an anagram of s, and false otherwise.
            An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
        Link:
            https://leetcode.com/problems/valid-anagram/

 */
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean isValidAnagram = checkAnagram(s, t);
        System.out.println(isValidAnagram);

        System.out.println("-----------");
        boolean isValidAnagramUsingHashMap = checkAnagramUsingHashMap(s, t);
        System.out.println(isValidAnagramUsingHashMap);
    }

    static boolean checkAnagramUsingHashMap(String s, String t){
        //check if the length of both string is same or not
        if(s.length() != t.length()) return false;

        //Loop over all charatcer of String s and put it in the hashmap;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        //Now loop over String t
        for(int i=0; i < t.length(); i++){
            //Check if the current character already exists in hashmap
            if(map.containsKey(t.charAt(i))){
                //It contains reduce count of that character by 1
                map.put(t.charAt(i), map.get(t.charAt(i))- 1);
            }
        }

        System.out.println(map);

        //Extract all keys of hashmap
        Set<Character> keys = map.keySet();
        for(Character key : keys){
            if(map.get(key) != 0){
                return false;
            }
        }



        //returning true as all keys are zero
        return true;

    }
    static boolean checkAnagram(String s, String t){
        char[] ch = new char[26];
        for(int i=0; i < s.length(); i++){
            ch[s.charAt(i) - 'a']++;
        }

        for(int i=0; i < t.length(); i++){
            ch[t.charAt(i) - 'a']--;
        }

        for( int c : ch){
            if(c != 0) return false;
        }
        return true;
    }
}
