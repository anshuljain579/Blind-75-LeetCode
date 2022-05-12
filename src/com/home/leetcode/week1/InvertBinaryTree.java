package com.home.leetcode.week1;

import com.home.leetcode.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/*
    Questions:
        Given the root of a binary tree, invert the tree, and return its root.
    Link:
        https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTree {
    static TreeNode root;

    public static void main(String[] args) {
        root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        invertBinary(root);

        System.out.println();
        invertBinaryUsingRecursion(root);
    }

    static TreeNode invertBinaryUsingRecursion(TreeNode root){
        //corner case
        if(root == null) return null;

        TreeNode left = invertBinaryUsingRecursion(root.left);
        TreeNode right = invertBinaryUsingRecursion(root.right);

        root.left = right;
        root.right = left;

        return root;

    }

    static void invertBinary(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            TreeNode left = node.left;
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
