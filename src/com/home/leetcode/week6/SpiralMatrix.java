package com.home.leetcode.week6;

import java.util.ArrayList;
import java.util.List;

/*
    Link:
        https://leetcode.com/problems/spiral-matrix/
    Question:
        Given an m x n matrix, return all elements of the matrix in spiral order.


 */
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};

        List<Integer> result = printMatrixInSpiralWay(mat);
        System.out.println(result);
    }

    static List<Integer> printMatrixInSpiralWay(int[][] mat){
        int row = mat.length;
        int col = mat[0].length;

        int top = 0;
        int bottom = row -1;
        int left = 0;
        int right = col -1;

        int dir = 1;

        List<Integer> result = new ArrayList<>();

        while(top <= bottom && left <= right){
            if(dir == 1){
                //moving left to right
                for(int i=left; i <= right; i++){
                    result.add(mat[top][i]);
                }
                top++;
                dir = 2;
            }
            else if(dir == 2){
                //moving top to bottom
                for(int i=top; i <= bottom; i++){
                    result.add(mat[i][right]);
                }
                right--;
                dir = 3;
            }
            else if(dir == 3){
                //moving right to left
                for(int i=right; i >= left; i--){
                    result.add(mat[bottom][i]);
                }
                bottom--;
                dir = 4;
            }
            else if(dir == 4){
                //moving bottom to top
                for(int i=bottom; i >= top; i--){
                    result.add(mat[i][left]);
                }
                left++;
                dir = 1;
            }
        }
        return result;
    }
}
