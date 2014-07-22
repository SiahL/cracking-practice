package com.iheanyi.crackingpractice.ChapterOne;

import java.util.HashMap;

/**
 * Created by iheanyi on 7/20/14.
 */
public class ProblemOne {

    /*
        Problem One: Implement an algorithm to determine if a string shell has all unique characters.
        What if you cannot use additional data structures?

     */

    public static boolean allUniqueCharacters(String inputStr) {

        // If the length of the string is one, then you'll probably have
        if (inputStr.length() ==  1) {
            return true;
        }

        HashMap<Character, Boolean> characterMap = new HashMap<Character, Boolean>();

        for(int i=0; i < inputStr.length(); i++) {
            char c = inputStr.charAt(i);

            if (characterMap.containsKey(c)) {
                return false;
            } else {
                characterMap.put(c, true);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // write your code here
        boolean testOne = allUniqueCharacters("testing");

        System.out.println(Boolean.toString(testOne));

        System.out.println(Boolean.toString(allUniqueCharacters("meh")));
    }




}
