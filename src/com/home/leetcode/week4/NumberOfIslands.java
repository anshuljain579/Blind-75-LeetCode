package com.home.leetcode.week4;

/*
    Link:
        https://leetcode.com/problems/number-of-islands/
 */
public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        int count = getCountOfIslands(grid);
        System.out.println(count);
    }

    static int getCountOfIslands(char[][] grid){
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;

        for(int i=0; i < row; i++){
            for(int j=0; j < col; j++){
                if(grid[i][j] == '1'){
                    dfsUtil(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    static void dfsUtil(char[][] grid, int i, int j){
        //corner case
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1'){
            return;
        }

        grid[i][j] = '0';
        dfsUtil(grid, i+1, j);
        dfsUtil(grid, i-1, j);
        dfsUtil(grid, i, j+1);
        dfsUtil(grid, i, j-1);
    }
}
