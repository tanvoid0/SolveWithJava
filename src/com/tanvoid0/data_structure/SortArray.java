package com.tanvoid0.data_structure;

import java.util.Arrays;

public class SortArray {
  public static void main(String[] args) {
    int[] nums = {1,2};
//    int[] nums = {-1, -100, 3, 99};
//    int[] nums = {1,2,3,4,5,6,7};
    rotate(nums, 2);
    System.out.println(Arrays.toString(nums));
  }

  public static void rotate(int[] nums, int k) {
    int[] arr = new int[nums.length];
    for (int i=0, j = k > nums.length ? k % nums.length : k; i<nums.length; i++, j++) {
      if(j >= nums.length) j = 0;
      arr[j] = nums[i];
    }
    for (int i=0; i<nums.length; i++) {
      nums[i] = arr[i];
    }

  }
}
