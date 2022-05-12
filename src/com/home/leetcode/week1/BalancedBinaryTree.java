package com.home.leetcode.week1;

import com.home.leetcode.util.TreeNode;

/*
    Questions:
        Given a binary tree, determine if it is height-balanced. For this problem, a height-balanced binary tree is defined as:
        A binary tree in which the left and right subtrees of every node differ in height by no more than 1.
    Link:
        https://leetcode.com/problems/balanced-binary-tree/

 */
public class BalancedBinaryTree {
    static TreeNode root;

    public static void main(String[] args) {
        root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        boolean isBalanced = checkBalanced(root);
        System.out.println(isBalanced);

    }

    private static boolean result = true;
    public static boolean checkBalanced(TreeNode root){
        //get max depth
        maxDepth(root);
        return result;
    }

    public static int maxDepth(TreeNode root){
        if(root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if(Math.abs(left - right) > 1){
            result = false;
        }

        return 1 + Math.max(left, right);
    }

}
