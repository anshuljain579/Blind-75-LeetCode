package com.home.leetcode;

/*
    Questions:
        You are given the heads of two sorted linked lists list1 and list2.
        Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
        Return the head of the merged linked list.

    Link:
        https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head1;
    static Node head2;

    public static void main(String[] args) {
        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);

        head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);

        head1 = mergeTwoList(head1, head2);
        printList(head1);
    }

    static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static Node mergeTwoList(Node head1, Node head2){

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
