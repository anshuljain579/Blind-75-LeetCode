package com.home.leetcode.week3;

/*
    Link:
        https://leetcode.com/problems/01-matrix/
 */
public class Matrix_01 {
    public static void main(String[] args) {
        int[][] nums = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };

        int[][] result = findNearestMatrix(nums);
        for(int i=0; i < result.length; i++){
            for(int j=0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findNearestMatrix(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        int INF = m+n;

        for(int r =0; r < m; r++){
            for(int c=0; c < n; c++){
                if(mat[r][c] == 0)
                    continue;

                int top = INF, left = INF;

                if(r - 1 >= 0) top = mat[r-1][c];
                if(c - 1 >=0) left = mat[r][c-1];

                mat[r][c] = Math.min(top, left) + 1;
            }
        }

        for(int r = 0; r < m; r++){
            for(int c=0; c < n; c++){
                if(mat[r][c] == 0) continue;

                int bottom = INF, right = INF;
                if(r + 1 < m) bottom = mat[r+1][c];
                if(c + 1 < n) right = mat[r][c+1];

                mat[r][c] = Math.min(mat[r][c], Math.min(right, bottom)+1);
            }
        }

        return mat;
    }
}
