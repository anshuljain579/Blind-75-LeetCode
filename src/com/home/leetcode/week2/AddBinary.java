package com.home.leetcode.week2;

/*
    Questions:
        Given two binary strings a and b, return their sum as a binary string.

    Link:
        https://leetcode.com/problems/add-binary/
 */
public class AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        /*
                1010  -> 10
               +1011  -> 11
             --------   ----
                10101    21
         */

        String result = addBinary(a, b);
        System.out.println(result);
    }

    static String addBinary(String a, String b){
        if(a == null && b == null) return "";

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0){
            int sum = carry;

            if(i >= 0){
                sum += a.charAt(i) - '0';
                i--;
            }

            if(j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }

        if( carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
