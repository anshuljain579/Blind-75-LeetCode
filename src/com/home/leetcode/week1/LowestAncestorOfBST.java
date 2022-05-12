package com.home.leetcode;
/*
    Link:
        https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class LowestAncestorOfBST {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    static Node root;

    public static void main(String[] args) {
        root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);

        root.left.left = new Node(0);
        root.left.right = new Node(4);

        root.right.left = new Node(7);
        root.right.right = new Node(9);

        root.left.right.left = new Node(3);
        root.left.right.right = new Node(5);

        Node lca = getLowestAncestorOfBST(root, root.left, root.right);
        System.out.println(lca.data);

    }

    static Node getLowestAncestorOfBST(Node root, Node p, Node q){
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
