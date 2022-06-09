//package com.tanvoid0.leetcode.problems;
//
//public class RomanToInteger {
//  public static void main(String[] args) {
//    String str = "MCMXCIV";
//    System.out.println(romanToInt(str));
//  }
//
//  public static int romanToInt(String s) {
//    int total = 0;
//    for (int i=0; i<s.length(); i++) {
//      switch (s.charAt(i)) {
//        case 'M' -> {
//          if(i == 0 || s.charAt(i-1) != 'C') total += 1000;
//          else total += 800;
//        }
//        case 'D' ->  {
//          if (i == 0 || s.charAt(i-1) != 'C') total += 500;
//          else total += 300;
//        }
//        case 'C' -> {
//          if (i == 0 || s.charAt(i-1) != 'X') total += 100;
//          else total += 80;
//        }
//        case 'L' -> {
//          if (i == 0 || s.charAt(i-1) != 'X') total += 50;
//          else total += 30;
//        }
//        case 'X' -> {
//          if (i == 0 || s.charAt(i-1) != 'I') total += 10;
//          else total += 8;
//        }
//        case 'V' -> {
//          if (i == 0 || s.charAt(i-1) != 'I') total += 5;
//          else total += 3;
//        }
//        case 'I' -> total += 1;
//      }
//    }
//    return total;
//  }
//}
