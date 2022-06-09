package com.tanvoid0.leetcode.problems.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayProblems {
  public static void main(String[] args) {
    int[] nums1 = {1,2,3,0,0,0};
    int[] nums2 = {2,5,6};
    merge(nums1, 3, nums2, 3);
//    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(Arrays.toString(nums1));
  }

  static void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] arr = new int[m+n];
    int i=0;
    int j=0;
    int k=0;
    while(k < m+n) {
      if(i < m && j < n) {
        if(nums1[i] <= nums2[j]) {
          arr[k++] = nums1[i++];
        } else {
          arr[k++] = nums2[j++];
        }
      } else if(i < m) {
        arr[k++] = nums1[i++];
      } else if(j < n) {
        arr[k++] = nums2[j++];
      }
    }
    System.arraycopy(arr, 0, nums1, 0, m+n);
  }

  public static int[] twoSum(int[] nums, int target) {
    int min = 0;
    int max = nums.length-1;
    while(min < max) {
      if (nums[min] + nums[max] > target) {
        max--;
      } else if (nums[min] + nums[max] < target) {
        min++;
      } else {
        int[] a = {min+1, max+1};
        return a;
      }
    }
    return null;
  }
  public static void moveZeroes(int[] nums) {
    Queue<Integer> q = new LinkedList<>();
    for(int i=0; i<nums.length; i++) {
      if(nums[i] == 0) continue;
      q.add(nums[i]);
    }
    for (int i=0; i<nums.length; i++) {
      if (q.size() == 0) {
        nums[i] = 0;
        continue;
      }
      nums[i] = q.remove();
    }
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
