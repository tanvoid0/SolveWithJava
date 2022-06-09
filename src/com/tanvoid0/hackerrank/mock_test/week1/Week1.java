package com.tanvoid0.hackerrank.mock_test.week1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Week1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    int[] arr = new int[T];

    for (int i=0; i<T; i++) {
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);
    int index = (T-1)/2;
    System.out.println(arr[index]);
  }

  public static int findMedian(List<Integer> arr) {
    int T = arr.size();

    Collections.sort(arr);
    int index = (T-1)/2;
    return arr.get(index);
  }
}
