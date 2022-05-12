package com.home.leetcode.week1;

import com.home.leetcode.util.ListNode;

/*
    Questions:
        You are given the heads of two sorted linked lists list1 and list2.
        Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
        Return the head of the merged linked list.

    Link:
        https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedList {

    static ListNode head1;
    static ListNode head2;

    public static void main(String[] args) {
        head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);

        head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

        head1 = mergeTwoList(head1, head2);
        printList(head1);
    }

    static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static ListNode mergeTwoList(ListNode head1, ListNode head2){

        if(head1 == null) return head2;

        if(head2 == null) return head1;

        if(head1.data < head2.data){
            head1.next = mergeTwoList(head1.next, head2);
            return head1;
        }
        else{
            head2.next = mergeTwoList(head1, head2.next);
            return head2;
        }
    }
}
