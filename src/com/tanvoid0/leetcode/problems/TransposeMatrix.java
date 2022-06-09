package com.tanvoid0.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class TransposeMatrix {
  public static void main(String[] args) {
    int[][] matrix = new int[][] {
        {1, 2, 3}, {4, 5}, {6, 7, 8, 9}
    };
    int[][] mat = transpose(matrix);
    for (int i=0; i<mat.length; i++) {
      for (int j=0; j<mat[i].length; j++) {
        System.out.print(mat[i][j]);
      }
      System.out.println("");
    }
  }
  public static int[][] transpose(int[][] matrix) {
    int[][] mat = new int[matrix.length][matrix[0].length];

    for (int i=0; i<matrix.length; i++) {
      for (int j=0; j<matrix[i].length; j++) {
        int val = matrix[j][i];
        mat[i][j] = val;
      }
    }
    return mat;
  }
}
