package com.home.leetcode.week2;

import java.util.Stack;

/*
    Link:
        https://leetcode.com/problems/min-stack/
 */
public class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        //only push the old min value when the current minimum value changes after the new value
        if(val <= min){
            stack.push(min);
            min = val;
        }

        stack.push(val);
    }

    public void pop() {
        if(stack.pop()== min){
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
