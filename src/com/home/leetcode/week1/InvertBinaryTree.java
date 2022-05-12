package com.home.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/*
    Questions:
        Given the root of a binary tree, invert the tree, and return its root.
    Link:
        https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTree {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    static Node root;

    public static void main(String[] args) {
        root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);

        root.left.left = new Node(1);
        root.left.right = new Node(3);

        root.right.left = new Node(6);
        root.right.right = new Node(9);

        invertBinary(root);

        System.out.println();
        invertBinaryUsingRecursion(root);
    }

    static Node invertBinaryUsingRecursion(Node root){
        //corner case
        if(root == null) return null;

        Node left = invertBinaryUsingRecursion(root.left);
        Node right = invertBinaryUsingRecursion(root.right);

        root.left = right;
        root.right = left;

        return root;

    }

    static void invertBinary(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node node = queue.poll();
            Node left = node.left;
            node.left = node.right;
            node.right = left;

            if(node.left != null){
                queue.add(node.left);
            }

            if(node.right != null){
                queue.add(node.right);
            }
        }
    }
}
