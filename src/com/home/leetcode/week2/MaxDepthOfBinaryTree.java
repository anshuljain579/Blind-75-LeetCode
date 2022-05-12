package com.home.leetcode.week2;

import com.home.leetcode.util.TreeNode;

/*
    Questions:
        Given the root of a binary tree, return its maximum depth.
        A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
    Link:
        https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class MaxDepthOfBinaryTree {
    static TreeNode root;

    public static void main(String[] args) {
        root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int depth = maxDepth(root);
        System.out.println(depth);

    }
    static int maxDepth(TreeNode root){
        if(root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left, right);
    }

}
