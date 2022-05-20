package com.home.leetcode.week5;

import com.home.leetcode.util.TreeNode;

/*
    Link:
        https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

 */
public class LowestCommonAncestor {
    static TreeNode root;

    public static void main(String[] args) {
        root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode lca = findLCA(root, root.left, root.left.right.right);
        System.out.println(lca.data);

    }

    static TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return null;

        if(root == p || root == q) return root;

        TreeNode left = findLCA(root.left, p, q);
        TreeNode right = findLCA(root.right, p, q);

        if(left != null && right != null) return root;

        if(left == null && right == null) return null;

        return left != null ? left : right;
    }
}
