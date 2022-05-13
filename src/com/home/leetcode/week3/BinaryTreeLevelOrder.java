package com.home.leetcode.week3;

import com.home.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
    Question:
        Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

    Link:
        https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class BinaryTreeLevelOrder {
    static TreeNode root;

    public static void main(String[] args) {
        root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<Integer> levelOrder = getLevelOrder(root);
        System.out.println(levelOrder);

    }

    public static List<Integer> getLevelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()){

            TreeNode temp = queue.poll();
            result.add(temp.data);

            if(temp.left != null){
                queue.add(temp.left);
            }

            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        return result;

    }
}
