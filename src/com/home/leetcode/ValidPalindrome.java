package com.home.leetcode;

/*
        Questions:
            A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
            it reads the same forward and backward. Alphanumeric characters include letters and numbers.
            Given a string s, return true if it is a palindrome, or false otherwise.
        Link:
            https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean isValidPalindrome = checkPalindrome(str);

        System.out.println(isValidPalindrome);
    }

    static boolean checkPalindrome(String s){
        int head = 0;
        int tail = s.length()-1;

        char cHead;
        char cTail;

        while(head <= tail){
            cHead = s.charAt(head);
            cTail = s.charAt(tail);

            if(!Character.isLetterOrDigit(cHead)){
                head++;
            }
            else if (!Character.isLetterOrDigit(cTail)){
                tail--;
            }
            else{
                if(Character.toLowerCase(cHead) != Character.toLowerCase(cTail)){
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }
}
