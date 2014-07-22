package com.iheanyi.crackingpractice.ChapterTwo;

import java.util.Hashtable;
import java.util.LinkedList;

/**
 * Created by iheanyi on 7/20/14.
 */
public class ProblemOne {
    /* Write code to remove duplicate nodes from an unsorted linked list
    *
    *
    * My Solution's Space Complexity: O(n), because of the additional hash table.
    * */


    public static void main (String[] args) {


        Node head = new Node(7);

        System.out.println("Appending");

        head.appendToTail(6);
        head.appendToTail(8);
        head.appendToTail(5);
        head.appendToTail(5);
        head.appendToTail(10);
        head.appendToTail(12);
        head.appendToTail(6);

        System.out.println("Finished appending");

        Node n = head;
        while(n != null) {
            System.out.println(n.data);
            n = n.next;
        }

        removeDuplicates(head);

        System.out.println("How about duplicates?");
        Node n2 = head;

        while(n2 != null) {
            System.out.println(n2.data);
            n2 = n2.next;
        }
    }

    public static void removeDuplicates(Node n) {
        Node prev;

        Hashtable<Integer, Boolean> dupTable = new Hashtable<Integer, Boolean>();   // HashTable to story data and if it exists already
        prev = null;

        System.out.println("Handling duplicates");

        // Loop through and remove any duplicates already in the table.
        while(n != null) {
            if(dupTable.containsKey(n.data)) {
              System.out.println("Duplicate found!");
              prev.next = n.next;
            } else {
                dupTable.put(n.data, true);
                prev = n;
            }

            n = n.next;
        }
    }
}