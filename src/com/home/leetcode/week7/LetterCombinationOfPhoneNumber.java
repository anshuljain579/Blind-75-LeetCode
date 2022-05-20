package com.home.leetcode.week7;

import java.util.LinkedList;
import java.util.List;

/*
    Link:
        https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */
public class LetterCombinationOfPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        List<String> combinations = getCombinationsOfDigits(digits);
        System.out.println(combinations);
    }

    static List<String> getCombinationsOfDigits(String digits){
        LinkedList<String> result = new LinkedList<>();

        if(digits.isEmpty()) return result;

        String[] mapping = new String[]{"0", "1", "abc" , "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");

        for(int i=0; i < digits.length(); i++){
            int x = Character.getNumericValue(digits.charAt(i));

            while(result.peek().length() == i){
                String t = result.remove();
                for(char s : mapping[x].toCharArray()){
                    result.add(t+s);
                }
            }
        }
        return result;
    }
 }
