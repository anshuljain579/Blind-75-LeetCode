package com.home.leetcode.week6;

import java.util.Hashtable;

/*
    Link:
        https://leetcode.com/problems/lru-cache/
 */
public class LRU_Cache {
    private Hashtable<Integer, DLinkedNode> cache = new Hashtable<>();
    private int count;
    private int capacity;
    private DLinkedNode head, tail;

    class DLinkedNode {
        int key;
        int data;

        DLinkedNode pre;
        DLinkedNode post;
    }

    /**
     * Always add the new node right after head
     */
    private void addNode(DLinkedNode node){
        node.pre = head;
        node.post = head.post;

        head.post.pre = node;
        head.post = node;
    }

    /**
     * Remove an existing node the linked list
     */
    private void removeNode(DLinkedNode node){
        DLinkedNode pre = node.pre;
        DLinkedNode post = node.post;

        pre.post = post;
        post.pre = pre;
    }
}
