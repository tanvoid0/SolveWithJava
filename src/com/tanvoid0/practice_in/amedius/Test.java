package com.tanvoid0.practice_in.amedius;

import java.util.Arrays;


public class Test {
  public static void main(String[] args) {
    int array[]={2,6,7,8,13,19,27,55,80};
    int key = 140;
    int index = Arrays.binarySearch(array,key);
    System.out.print(key+" found at index: "+index);
  }

  void findMin(int amount) {
    Change change = new Change(amount);
  }
}

//class Change {
//  long coin2 = 0;
//  long bill5 = 0;
//  long bill10 = 0;
//  public Change(long amount) {
//    this.calculate(amount);
//  }
//
//  public void calculate(long amount) {
//    int denominations[] = {2, 5, 10};
//
//    for (int i=denominations.length - 1; i>=0; i--) {
//      while (amount >= denominations[i]) {
//        amount -= denominations[i];
//        if (2 == i) {
//          bill10++;
//        } else if (1 == i) {
//          bill5++;
//        } else if (0 == i) {
//          coin2++;
//        }
//      }
//    }
//  }
//}