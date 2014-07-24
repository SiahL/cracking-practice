package com.iheanyi.crackingpractice.ChapterTwo;

import java.util.Stack;

/**
 * Created by iheanyi on 7/24/14.
 */
public class ProblemSeven {

    public static void main(String[] args) {


        ProblemSeven mInstance = new ProblemSeven();

        Node head = new Node(7);
        head.appendToTail(6);
        head.appendToTail(7);

        Node second = new Node(6);
        second.appendToTail(5);
        second.appendToTail(5);

        System.out.println(mInstance.isPalindrome(head));
        System.out.println(mInstance.isPalindrome(second));
    }

    public static boolean isPalindrome(Node n) {
        Stack<Integer> dataStack = new Stack<Integer>();

        Node head = n;

        while (n != null) {
            dataStack.push(n.data);
            n = n.next;
        }

        while (head != null) {
            int value = dataStack.pop();
            if (value != head.data) {
                return false;
            }

            head = head.next;
        }

        return true;
    }
}
