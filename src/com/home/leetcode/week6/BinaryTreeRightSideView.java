package com.home.leetcode.week6;

import com.home.leetcode.util.TreeNode;

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
    static TreeNode head;

    public static void main(String[] args) {
        head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);

        head.left.right = new TreeNode(5);
        head.right.right = new TreeNode(4);

        List<Integer> rightSide = printRightSide(head);
        System.out.println(rightSide);
    }

    static List<Integer> printRightSide(TreeNode root){
        List<Integer> list = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i=1; i <= n; i++){
                TreeNode temp = queue.poll();

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
