package com.iheanyi.crackingpractice.ChapterOne;

import java.util.HashMap;

/**
 * Created by iheanyi on 7/20/14.
 */
public class ProblemThree {

    /*

    Problem Three: Given two strings, write a method to decide if one is a permutation of the other.

    */

    HashMap<Character, Integer> permMap = new HashMap<Character, Integer>();

    public static void main(String[] args) {

        ProblemThree testClass = new ProblemThree();
        System.out.println(Boolean.toString(testClass.isPairPermutation("cat", "tac")));
        System.out.println(Boolean.toString(testClass.isPairPermutation("cat", "dog")));
    }


    public void buildPermutationMap(String stringOne, String stringTwo) {
        // Loop through both strings, checking each character accordingly.
        // Encounter character from first string, increment by one.
        // Encounter character from second string, decrement value in dictionary by one.
        for(int i = 0; i < stringOne.length(); i++) {
            Character firstChar = stringOne.charAt(i);
            Character secondChar = stringTwo.charAt(i);

            if (this.permMap.containsKey(firstChar)) {
                int value = this.permMap.get(firstChar);
                this.permMap.put(firstChar, value+1);
            } else {
                this.permMap.put(firstChar, 1);
            }

            if (this.permMap.containsKey(secondChar)) {
                int value = this.permMap.get(secondChar);
                this.permMap.put(secondChar, value-1);
            } else {
                this.permMap.put(secondChar, -1);
            }
        }
    }

    public void checkPermutationMap() {

    }

    public boolean isPairPermutation(String stringOne, String stringTwo) {

        // Store each of the characters in a HashMap.
        //HashMap<Character, Integer> permMap = new HashMap<Character, Integer>();

        // If the two strings are not the same length, then return false automatically.
        // I think this would be O(n)
        if(stringOne.length() != stringTwo.length()) {
            return false;
        }

        buildPermutationMap(stringOne, stringTwo);
        System.out.println(this.permMap.toString());

        for(int i : this.permMap.values()) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
