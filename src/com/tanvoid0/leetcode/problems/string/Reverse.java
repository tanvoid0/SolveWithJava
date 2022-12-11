package com.tanvoid0.leetcode.problems.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reverse {

  public static void main(String[] args) {
    String str = "Let's take LeetCode contest";
    reverseWordsOfString(str);
    System.out.println(str);
  }
  public static void reverseString(char[] s) {
    char[] ch = new char[s.length];
    for (int i=0, j= s.length-1; i<s.length; i++, j--) {
      ch[i] = s[j];
    }
    System.arraycopy(ch, 0, s, 0, ch.length);
  }

  public static void reverseWordsOfString(String s) {
    String[] str = s.split(" ");
    for(int i=1; i<str.length; i++) {
      str[i] = new StringBuilder(str[i]).reverse().toString();
    }
    s = String.join(" ", str);
  }

  public static String cleanReverseWords(String s) {
    return Stream.of(s.split(" ")).map(i -> new StringBuilder(i).reverse().toString()).collect(Collectors.joining(" "));
  }
}
