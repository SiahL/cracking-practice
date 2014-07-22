package com.iheanyi.crackingpractice.ChapterOne;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by iheanyi on 7/20/14.
 */
public class ProblemSix {

    /* Problem 1.6: Given an image represented by an NxN matrix, write an algorithm to rotate the matrix by 90
    degrees. */

    int[][] pixelArray;

    public static void main(String[] args) {


        ProblemSix psix = new ProblemSix();
        psix.buildArray(3);
        System.out.println(Arrays.deepToString(psix.pixelArray));
    }

    public int[][] buildArray(int size) {
        this.pixelArray = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};

        return this.pixelArray;
    }

    public void rotateMatrix(int[][] mArray, int n) {

        for(int layer = 0; layer < n/2; ++layer) {
        }

    }

    public void swapPoints(int[] row) {

    }

}
