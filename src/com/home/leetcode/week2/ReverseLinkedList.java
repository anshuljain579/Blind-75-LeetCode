package com.home.leetcode.week2;

import com.home.leetcode.util.ListNode;

/*
    Questions:
        Given the head of a singly linked list, reverse the list, and return the reversed list.

    Link:
        https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {
    static ListNode head;

    public static void main(String[] args) {
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = reverseList(head);

        System.out.println("After Reverse");
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
