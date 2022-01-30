package com.epam.rd.autotasks;

import java.util.Arrays;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[] array = new int[rows * columns+1];
        for (int i = 1; i <= rows * columns+1; i++) {
            array[i-1] = i;
        }
        int[][] mat = new int[rows][columns];
        int top = 0,
                bottom = rows - 1,
                left = 0,
                right = columns - 1;

        int index = 0;

        while (true) {
            if (left > right)
                break;

            // print top row
            for (int i = left; i <= right; i++)
                mat[top][i] = array[index++];
            top++;

            if (top > bottom)
                break;

            // print right column
            for (int i = top; i <= bottom; i++)
                mat[i][right] = array[index++];
            right--;

            if (left > right)
                break;

            // print bottom row
            for (int i = right; i >= left; i--)
                mat[bottom][i] = array[index++];
            bottom--;

            if (top > bottom)
                break;

            // print left column
            for (int i = bottom; i >= top; i--)
                mat[i][left] = array[index++];
            left++;
        }
        return mat;
    }
//        int[][] array = new int[rows][columns];
//        int number = 1;
//        for (int i = 0; i < rows; i++){
//            for (int j = 0; j < columns; j++) {
//                array[i][j] = number;
//                number++;
//            }
//        }
//        // Defining the boundaries of the matrix.
//        columns = array[0].length;
//        int top = 0, bottom = rows - 1, left = 0, right = columns - 1;
//
//        // Defining the direction in which the array is to be traversed.
//        int dir = 1;
//
//        while (top <= bottom && left <= right) {
//
//            if (dir == 1) {    // moving left->right
//                for (int i = left; i <= right; ++i) {
//                    System.out.print(array[top][i] + " ");
//                }
//                // Since we have traversed the whole first
//                // row, move down to the next row.
//                ++top;
//                dir = 2;
//            }
//            else if (dir == 2) {     // moving top->bottom
//                for (int i = top; i <= bottom; ++i) {
//                    System.out.print(array[i][right]+ " ");
//                }
//                // Since we have traversed the whole last
//                // column, move left to the previous column.
//                --right;
//                dir = 3;
//            }
//            else if (dir == 3) {     // moving right->left
//                for (int i = right; i >= left; --i) {
//                    System.out.print(array[bottom][i]+ " ");
//                }
//                // Since we have traversed the whole last
//                // row, move up to the previous row.
//                --bottom;
//                dir = 4;
//            }
//            else if (dir == 4) {     // moving bottom->up
//                for (int i = bottom; i >= top; --i) {
//                    System.out.print(array[i][left]+ " ");
//                }
//                // Since we have traversed the whole first
//                // col, move right to the next column.
//                ++left;
//                dir = 1;
//            }

        //System.out.println(Arrays.toString(array));



    public static void main(String[] args) {
        int rows = 3, columns = 4;

        int[][] array = spiral(rows,columns);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
