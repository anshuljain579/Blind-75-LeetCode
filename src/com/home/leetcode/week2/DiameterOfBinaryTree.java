package com.home.leetcode.week2;

import com.home.leetcode.util.TreeNode;

/*
    Link:
        https://leetcode.com/problems/diameter-of-binary-tree/

 */
public class DiameterOfBinaryTree {
    static TreeNode root;

    public static void main(String[] args) {
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int diameterOfBinaryTree = getDiameterOfBinaryTree(root);
        System.out.println(diameterOfBinaryTree);
    }

    static int max = 0;
    static int getDiameterOfBinaryTree(TreeNode root){
        maxDepth(root);
        return max;
    }

    static int maxDepth(TreeNode root){
        if(root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        max = Math.max(max, left + right);

        return Math.max(left, right + 1);
    }
}
