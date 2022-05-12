package com.home.leetcode.week1;

import com.home.leetcode.util.TreeNode;

/*
    Link:
        https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class LowestAncestorOfBST {
    static TreeNode root;

    public static void main(String[] args) {
        root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        TreeNode lca = getLowestAncestorOfBST(root, root.left, root.right);
        System.out.println(lca.data);

    }

    static TreeNode getLowestAncestorOfBST(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return null;

        //if both p and q are smaller than root, then LCA lies in left
        if(root.data > p.data && root.data > q.data){
            return getLowestAncestorOfBST(root.left, p, q);
        }

        //if both p and q are greater than root, then LCA lies in right
        if(root.data < p.data && root.data < q.data){
            return getLowestAncestorOfBST(root.right, p, q);
        }

        return root;
    }
}
