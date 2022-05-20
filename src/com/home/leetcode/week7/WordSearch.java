package com.home.leetcode.week7;

/*
    Question:
        Given an m x n grid of characters board and a string word, return true if word exists in the grid.
        The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring.
        The same letter cell may not be used more than once.
    Link:
        https://leetcode.com/problems/word-search/

 */
public class WordSearch {
    public static void main(String[] args) {
        char[][] board ={
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        } ;

        String word = "ABCCED";

        boolean isExist = isWordExist(board, word);
        System.out.println(isExist);
    }

    static boolean isWordExist(char[][] board, String word){
        int row = board.length;
        int col = board[0].length;

        for(int i=0; i < row; i++){
            for(int j=0; j < col; j++){
                if(isExist(board, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isExist(char[][] board, int row, int col, String word, int index){
        if(index == word.length()) return true;

        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length) return false;

        if(board[row][col] != word.charAt(index)){
            return false;
        }

        boolean res =
                isExist(board, row+1, col, word, index+1) ||
                isExist(board, row-1, col, word, index+1) ||
                isExist(board, row, col+1, word, index+1) ||
                isExist(board, row, col-1, word, index+1);

        board[row][col] = word.charAt(index);
        return res;
    }
}
