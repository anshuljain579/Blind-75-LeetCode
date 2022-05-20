package com.home.leetcode.week6;

/*
    Link:
        https://leetcode.com/problems/string-to-integer-atoi/

 */
public class StringToAtoi {
    public static void main(String[] args) {
        String str = "4193 with words";
        int myAtoi = getMyAtoi(str);

        System.out.println(myAtoi);
    }

    static int getMyAtoi(String s){
        if(s.isEmpty()) return 0;

        int sign = 1;
        int base = 0;
        int i=0;

        while(s.charAt(i) == ' '){
            i++;
        }

        if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = s.charAt(i++) == '-' ? -1 : 1;
        }

        while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            if(base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            base = 10 * base + (s.charAt(i++) - '0');
        }
        return base*sign;
    }
}
