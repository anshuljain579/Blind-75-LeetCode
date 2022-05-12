package com.home.leetcode.week2;

import com.home.leetcode.util.ListNode;

/*
    Questions:
        Given the head of a singly linked list, return the middle node of the linked list.
        If there are two middle nodes, return the second middle node.
    Link:
        https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class MiddleOfLinkedList {
    static ListNode head;

    public static void main(String[] args) {
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode midNode = getMiddleNode(head);
        System.out.println(midNode.data);
    }

    static ListNode getMiddleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
