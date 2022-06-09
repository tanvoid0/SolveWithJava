package com.tanvoid0.leetcode.mock;

import java.util.LinkedList;
import java.util.Queue;

public class QueueProgram {
  public static void main(String[] args) {

  }
}

class MyQueue {
   Queue<Integer> q;

  public MyQueue() {
    q = new LinkedList();
  }

  public void push(int x) {
    q.add(x);
  }

  public int pop() {
    return q.remove();
  }

  public int peek() {
    return q.peek();
  }

  public boolean empty() {
    return q.isEmpty();
  }
}