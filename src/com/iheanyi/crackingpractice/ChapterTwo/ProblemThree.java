package com.iheanyi.crackingpractice.ChapterTwo;

/**
 * Created by iheanyi on 7/22/14.
 */
public class ProblemThree {

    /* Problem Three: Implement an algorith to delete the middle node from a Linked List,
       given access to only that node.

       Solution Time Complexity: O(1), since we are just updating a Node that we already have access to.
     */
    public static void main(String[] args) {


        ProblemThree mInstance = new ProblemThree();
        Node head = new Node(7);
        Node middle = new Node(3);

        head.appendToTail(middle);
        head.appendToTail(2);

        System.out.println("Before deleting middle node.");
        head.printNodes();


        mInstance.deleteMiddleNode(middle);
        System.out.println("After deleting middle node.");
        head.printNodes();

    }

    public void deleteMiddleNode(Node n) {
        n.data = n.next.data;
        n.next = n.next.next;
    }
}
