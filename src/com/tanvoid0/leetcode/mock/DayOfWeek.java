package com.tanvoid0.leetcode.mock;

import java.time.LocalDate;

class DayOfWeek {
  public static void main(String[] args) {
    dayOfTheWeek(3,5,2011);
  }

  public static void dayOfTheWeek(int day, int month, int year) {
    LocalDate date = LocalDate.of(year, month, day);
    System.out.println(date.getDayOfWeek().toString());
  }
}