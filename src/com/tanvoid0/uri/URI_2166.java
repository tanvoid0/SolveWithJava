package com.tanvoid0.uri;

import com.tanvoid0.utility.Skeleton;

import java.text.DecimalFormat;

public class URI_2166 implements Skeleton {

  private int N;
  private double result;

  @Override
  public void input() {
    N = sc.nextInt();
  }

  @Override
  public void solve() {
    result = rec(0, 0);
  }

  @Override
  public void output() {
    System.out.println(new DecimalFormat("#0.0000000000").format(result));
  }

  private double rec(int i, double total) {
    // if(i == 1) return sum + 1;
    // sum += i + 1/i;
    // double total = 1 / (double)(i + 1/i);
    // return rec(i-1, sum + (1 / ));
    if(i > N) return 0;
    return rec(i+1, (i+1) + 1/(rec(i+1, total)));
  }
}
