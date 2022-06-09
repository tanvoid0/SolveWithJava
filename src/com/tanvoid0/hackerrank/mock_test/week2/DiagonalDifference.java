package com.tanvoid0.hackerrank.mock_test.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiagonalDifference {
  public static void main(String[] args) {
    int n = 3;
    List<List<Integer>> arr = new ArrayList(Arrays.asList(Arrays.asList(11, 2, 4), Arrays.asList(4, 5, 6), Arrays.asList(10, 8, -12)));
    System.out.println(diagonalDifference(arr));
  }

  public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int lSum = 0, rSum = 0;
    for(int i=0; i<arr.size(); i++) {
      lSum += arr.get(i).get(i);
      rSum += arr.get(arr.size()-i-1).get(i);
    }

    return Math.abs(lSum-rSum);
  }
}
