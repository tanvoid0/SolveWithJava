package com.tanvoid0.hackerrank.mock_test.week1;

import java.util.Scanner;

public class PlusMinus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x;
    int positive = 0, negative = 0, neutral = 0;

    for (int i=0; i<n; i++) {
      x = sc.nextInt();
      if (x > 0) {
        positive++;
      } else if(x < 0) {
        negative ++;
      } else {
        neutral++;
      }
    }

    System.out.printf("%.6f\n", (double)positive/n);
    System.out.printf("%.6f\n", (double)negative/n);
    System.out.printf("%.6f\n", (double)neutral/n);
  }
}
