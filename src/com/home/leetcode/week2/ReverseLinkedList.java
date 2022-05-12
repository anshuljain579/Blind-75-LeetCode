package com.home.leetcode;

/*
    Questions:
        Given the head of a singly linked list, reverse the list, and return the reversed list.

    Link:
        https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = reverseList(head);

        System.out.println("After Reverse");
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static Node reverseList(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
