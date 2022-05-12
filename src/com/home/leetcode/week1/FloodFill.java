package com.home.leetcode;
/*
        Link: https://leetcode.com/problems/flood-fill/
 */
public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {
                        {1,1,1},
                        {1,1,0},
                        {1,0,1}
                        };

        int sr = 1;
        int sc = 1;
        int newColor = 2;

        floodFill(image, sr, sc, newColor);
    }

    public static void floodFill(int[][] image, int sr, int sc, int newColor){
        if(image[sr][sc] == newColor){
            return;
        }

        fill(image, sr, sc, image[sr][sc], newColor);
    }

    public static void fill(int[][] image, int sr, int sc, int color, int newColor){
        //corner case
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != newColor){
            return;
        }

        image[sr][sc] = newColor;

        fill(image, sr+1, sc, color, newColor);
        fill(image, sr-1, sc, color, newColor);
        fill(image, sr, sc+1, color, newColor);
        fill(image, sr, sc-1, color, newColor);
    }
}