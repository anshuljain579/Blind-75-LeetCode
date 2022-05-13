package com.home.leetcode.week2;

import java.util.Stack;

/*
    Link:
        https://leetcode.com/problems/implement-queue-using-stacks/
 */
public class QueueUsingStack {

    public class MyQueue{

        Stack<Integer> input;
        Stack<Integer> output;

        public MyQueue(){
            input = new Stack<>();
            output = new Stack<>();
        }

        public void push(int x){
            input.push(x);
        }

        public void pop(){
            peek();
            output.pop();
        }

        public int peek(){
            if(output.isEmpty()){
                while(!input.isEmpty()){
                    output.push(input.pop());
                }
            }
            return output.peek();
        }

        public boolean isEmpty(){
            return input.isEmpty() && output.isEmpty();
        }
    }

}
