package com.iheanyi.crackingpractice.ChapterTwo;

/**
 * Created by iheanyi on 7/22/14.
 */
public class ProblemFour {
    /*

    Problem Four: Write code to partition a linked list around a value x, such that all nodes less than x come
    before all nodes greater than or equal to x.

    Notes: Had to cheat a little bit with this one, I had the right logic/idea in my notes,
    splitting into two Linked Lists (one for less than, other for greater than) and then merging,
    but I messed up on the implementation. :/ Had to look at the solution for part of this one to get the correct
    implementation, but I think the fact that I got the logic correct will be close to good enough.
     */


    public static void main(String args[]) {
        ProblemFour mInstance = new ProblemFour();

        Node head = new Node(7);
        head.appendToTail(8);
        head.appendToTail(2);
        head.appendToTail(20);
        head.appendToTail(15);
        head.appendToTail(22);
        head.appendToTail(3);
        head.appendToTail(1);
        head.appendToTail(4);

        head.printNodes();
        head = mInstance.partitionAroundValue(head, 5);

        head.printNodes();
    }

    public Node partitionAroundValue(Node n, int x) {
        Node lessNode = null;       // Head Node of Less Than Linked List
        Node greaterNode = null;    // Head Node of Greater Than Linked List

        while (n != null) {
            Node next = n.next;

            if (n.data < x) {
                n.next = lessNode;
                lessNode = n;
            } else {
               n.next = greaterNode;
               greaterNode = n;
            }

            n = next;
        }

        Node head = lessNode;

        while (lessNode.next != null) {
            lessNode = lessNode.next;
        }

        lessNode.next = greaterNode;

        return head;
    }
}
