package com.tanvoid0.leetcode.problems.array;

public class ArrayProblems {
  public static void main(String[] args) {
    int[] nums = {1};
//    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(nums));
//    System.out.println(Arrays.toString(nums));
  }

  static int removeElement(int[] nums, int val) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == val) {
        continue;
      }
      nums[j++] = nums[i];
    }
    return j;
  }

  public int searchInsert(int[] nums, int target) {
    for (int i=0; i<nums.length; i++) {
      if (nums[i] >= target) return i;
    }
    return nums.length;
  }

  static public int maxSubArray(int[] nums) {
    int max = Integer.MIN_VALUE;
    for (int start=0; start<nums.length; start++) {
      for (int end = start; end < nums.length; end++) {
        if(max < total(nums, start, end)) {
          max = total(nums, start, end);
        }
      }
    }
    return max;
  }
  static public int total(int[] nums, int start, int end) {
    int sum = 0;
    for (int i=start; i<=end; i++) {
      sum += nums[i];
    }
    return sum;
  }
}
