package com.home.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
    Questions:
        Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

    Link:
        https://leetcode.com/problems/binary-tree-right-side-view/
 */
public class BinaryTreeRightSideView {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    static Node head;

    public static void main(String[] args) {
        head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);

        head.left.right = new Node(5);
        head.right.right = new Node(4);

        List<Integer> rightSide = printRightSide(head);
        System.out.println(rightSide);
    }

    static List<Integer> printRightSide(Node root){
        List<Integer> list = new ArrayList<>();

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i=1; i <= n; i++){
                Node temp = queue.poll();

                if(i == n){
                    list.add(temp.data);
                }

                if(temp.left != null){
                    queue.add(temp.left);
                }

                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
        }
        return list;
    }
}
