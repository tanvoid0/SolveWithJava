package com.tanvoid0.hackerrank.mock_test.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class LonelyInteger {
  public static void main(String[] args) {
    List<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,4,3,2,1));
    lonelyInteger(a);
  }

  public static int lonelyInteger(List<Integer> a) {
    Collections.sort(a);
    for (int i=0; i<a.size()-1; i+=2) {
      if (a.get(i) != a.get(i+1)) {
        return a.get(i);
      }
    }
    return a.get(a.size()-1);
  }
}

