package com.home.leetcode;

/*
    Questions:
        Given the head of a singly linked list, return the middle node of the linked list.
        If there are two middle nodes, return the second middle node.
    Link:
        https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class MiddleOfLinkedList {
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
        head.next.next.next.next.next = new Node(6);

        Node midNode = getMiddleNode(head);
        System.out.println(midNode.data);
    }

    static Node getMiddleNode(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
