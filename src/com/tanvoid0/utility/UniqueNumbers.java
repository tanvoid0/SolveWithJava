package com.tanvoid0.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UniqueNumbers {
  public static void main(String[] args) {
    List<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,4,3,2,1));
    lonelyInteger(a);
  }

  public static void lonelyInteger(List<Integer> a) {
    HashSet<Integer> unique = new HashSet<Integer>(a);

    System.out.println(unique);
  }
}
