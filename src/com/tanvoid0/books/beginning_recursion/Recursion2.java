package com.tanvoid0.books.beginning_recursion;

public class Recursion2 {
  static int N = 5;
  public static void main(String[] args) {
    example(1);
  }


  static void example(int i) {
    if(i>N) return;
  }

  static void example5(int i) {
    if(i > N) return;
    example5_1(i, 1);
    example5(i+1);
  }

  static void example5_1(int i, int j) {
    if (j > i) {
      System.out.println();
      return;
    }
    System.out.printf("%4d", i+j);
    example5_1(i, j+1);
  }

  static void example4(int i) {
    if(i > N) return;
    example4_1(i, 1);
    example4(i+1);
  }

  static void example4_1(int i, int j) {
    if(j > i) {
      System.out.println();
      return;
    }
    System.out.printf("%4d", j%2);
    example4_1(i, j+1);
  }

  static void example3(int i) {
    if(i > N) return;
    recursion3_1(i, 1);
    example3(i+1);
  }

  static void recursion3_1(int i, int j) {
    if(j > i) {
      System.out.println();
      return;
    }
    System.out.printf("%4d",i%2);
    recursion3_1(i, j+1);
  }

  static void example2(int i) {
    if (i > N) return;
    recursion2_1(i, 1);
    example2(i+1);
  }

  static void recursion2_1(int i, int j) {
    if(j > i) {
      System.out.println();
      return;
    }
    System.out.printf("%4d",i);
    recursion2_1(i, j+1);
  }

  static void example1(int i) {
    if(i > N)  return;
    recursion1_1(i, 1);
    example1(i+1);
  }

  static void recursion1_1(int i, int j) {
    if (j > i) {
      System.out.println();
      return;
    }
    System.out.printf("%4d", j);
    recursion1_1(i, j+1);
  }
}
