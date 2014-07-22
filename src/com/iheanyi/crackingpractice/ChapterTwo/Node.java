package com.iheanyi.crackingpractice.ChapterTwo;

/**
 * Created by iheanyi on 7/22/14.
 */
class Node {
    Node next = null;
    int data;

    public Node(int i) {
        data = i;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;

        // Walk through the linked list.
        while(n.next != null) {
            n = n.next;
        }

        n.next = end;
    }
}