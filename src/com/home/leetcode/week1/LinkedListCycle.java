package com.home.leetcode.week1;

/*
        Questions:
            Given head, the head of a linked list, determine if the linked list has a cycle in it.
        Link:
            https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycle {
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
        head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);

        head.next.next.next.next = head.next;

        boolean hasCycle = checkCycle(head);
        System.out.println(hasCycle);
    }

    static boolean checkCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null && slow != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
