package com.tanvoid0.hackerrank.mock_test.week1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class MiniMaxSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long[] nums = new long[5];

    for(int i=0; i<5; i++) {
      nums[i] = sc.nextLong();
    }
    Arrays.sort(nums);
    System.out.println(String.valueOf(LongStream.of(nums).sum() - nums[4])+" "+ String.valueOf(LongStream.of(nums).sum() - nums[0]));
  }
}
