package com.iheanyi.crackingpractice.ChapterOne;

/**
 * Created by iheanyi on 7/20/14.
 */
public class ProblemFive {
    /* 1.5: String Compression Problem */

    public static void main(String[] args) {

        ProblemFive mInstance = new ProblemFive();

        System.out.println(mInstance.compressString("aabcccccaaa"));
        System.out.println(mInstance.compressString("ab"));
    }

    public String compressString(String fString) {

        // Get length of the string and number of different characters (for compression size)
        int len = 0;
        int uniqueLen = 0;

        char currChar = fString.charAt(0);
        uniqueLen++;

        for(int i = 0; i < fString.length(); ++i) {
            len++;

            if (fString.charAt(i) != currChar) {
                currChar = fString.charAt(i);
                uniqueLen++;
            }
        }

        // If the length of the original string is less than or equal to double the amount of unique characters in
        // the string, then the original string will always be shorter.
        if(len <= uniqueLen*2) {
            return fString;
        }
        StringBuilder mBuilder = new StringBuilder();
        char prevChar = fString.charAt(0);
        int charCount = 0;
        mBuilder.append(prevChar); // Append the first character to the string.

        for(int i = 0; i < fString.length(); ++i) {
            char current = fString.charAt(i);

            if(current == prevChar) {
                // This means we are still on the same character.
                charCount++;
            } else {
               // We've found a new character, meaning that we should append the count of the previous character and
               // reset the counter to zero, along with appending the newly found character.
               mBuilder.append(charCount);
               charCount = 1;
               prevChar = current;
               mBuilder.append(current);
            }
        }

        mBuilder.append(charCount); // Append to the end of this because the logic doesn't catch the end of the loop.

        return mBuilder.toString();
    }
}
