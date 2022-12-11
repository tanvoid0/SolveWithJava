package com.tanvoid0.practice_in.amedius;

import static org.assertj.core.api.Java6Assertions.assertThat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TestTest {

  @Test
   public final void test() {
    int array[]={2,6,7,8,13,19,27,55,80};
    int key = 140;
    int index = Arrays.binarySearch(array,key);
//    System.out.print(key+" found at index: "+index);
    assertThat(index).isLessThan(-1000);
  }

  @Test
  public void test2() {
    long s = 10L;
    Change m = Solution.optimalChange(s);

    System.out.println("2: "+m.coin2);
    System.out.println("5: "+m.bill5);
    System.out.println("10: "+m.bill10);
    long result = m.coin2 * 2 + m.bill5 *5 + m.bill10 * 10;
//    assertThat(result).isEqualTo(s);
    assertThat(m.optimal).isFalse();
  }

}

class Solution {
  static Change optimalChange(final long s) {
    return new Change(s);
  }
}

class Change {
  public long coin2 = 0;
  public long bill5 = 0;
  public long bill10 = 0;
  public boolean optimal = false;
  public Change(long amount) {
    this.calculate(amount);
  }

  public void calculate(long amount) {
    int[] denominations = {2, 5, 10};

    for (int i=denominations.length - 1; i>=0; i--) {
      while (amount >= denominations[i]) {
        amount -= denominations[i];
        if (2 == i) {
          bill10++;
        } else if (1 == i) {
          bill5++;
        } else if (0 == i) {
          coin2++;
        }
      }
    }
    if (0 == amount) {
      optimal = true;
    }
  }
}