package com.iheanyi.crackingpractice.ChapterTwo;

/**
 * Created by iheanyi on 7/22/14.
 */
public class ProblemTwo {

    /* Write an algorithm to find the kth to last element of a linked list
    *
    * Solution's Space Complexity: O(1) since we don't need another data structure.
    * */

    public static void main(String[] args) {

        // Instantiate linked list for testing.
        Node head = new Node(7);
        head.appendToTail(6);
        head.appendToTail(5);
        head.appendToTail(4);

        ProblemTwo mInstance = new ProblemTwo();

        mInstance.findKthToLastNode(head, 2);
    }

    public int findListLength(Node n) {

        int i = 0;
        while(n != null) {
            n = n.next;
            i++;
        }

        return i;
    }

    public void findKthToLastNode(Node n, int k) {
        int len = findListLength(n);    // Find length of the Linked List. O(n) because it loops through entire list.

        int location = len - k;

        // Loop through list until you get to the desired location. O(n) because of looping through list.
        for(int i = 0; i < location; i++) {
            n = n.next;
        }

        // After done looping, just print out the element we're on.
        System.out.println(n.data);
    }
}
