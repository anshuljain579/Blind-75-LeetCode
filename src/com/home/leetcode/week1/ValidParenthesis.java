package com.home.leetcode.week1;

import jdk.dynalink.beans.StaticClass;

import java.util.Stack;

/*
    Question:
           Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
           An input string is valid if:
               1. Open brackets must be closed by the same type of brackets.
               2. Open brackets must be closed in the correct order.

     Link:
        https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "()[]{";

        boolean isValidStr = checkValidParenthesis(str);
        System.out.println(isValidStr);
    }

    static boolean checkValidParenthesis(String s){
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '['){
                stack.push(']');
            }
            else if (ch == '{'){
                stack.push('}');
            }
            else if (ch == '('){
                stack.push(')');
            }
            else if (!stack.isEmpty() && stack.pop() != ch){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
