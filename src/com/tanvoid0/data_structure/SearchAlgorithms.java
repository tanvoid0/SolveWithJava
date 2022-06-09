package com.tanvoid0.data_structure;

public class SearchAlgorithms {
  public static void main(String[] args) {
    int[] nums = {1,3,5,6};
    int target = 7;
    System.out.println(search(nums, target));
  }

  public static int search(int nums[], int target) {
    return binaryInsert(nums, target, 0, nums.length-1);
  }

  public static boolean duplicateArray(int[] nums) {
    int[] arr = new int[nums.length];
    for (int num : nums) {
      if (arr[num] > 0) return true;
      arr[num]++;
    }
    return false;
  }

  public static int binarySearch(int nums[], int T, int L, int R) {
    if (L > R) {
      return R+1;
    }
    int M = L + (R-L)/2;
    if (nums[M] < T) {
      return binarySearch(nums, T, M + 1, R);
    } else if (nums[M] > T) {
      return binarySearch(nums, T, L, M - 1);
    }
    return M;
  }

  public static int binaryInsert(int nums[], int T, int L, int R) {
    if (L > R) {
      return R;
    }
    int M = L + (R-L)/2;
    if (nums[M] < T) {
      return binarySearch(nums, T, M + 1, R);
    } else if (nums[M] > T) {
      return binarySearch(nums, T, L, M - 1);
    }
    return M;
  }

  public static int firstBadVersion(int n) {
    return badVersion(1, n);
  }

  public static int badVersion(int left, int right) {
    if (left > right) return -1;
    int m = (int) Math.floor((left+right) / 2);
    if (!isBadVersion(m)){
      return badVersion(m+1, right);
    } else {
      if (isBadVersion(left)) return left;
      else if(left == m) return m;
      return badVersion(left, m-1);
    }
  }

  static boolean isBadVersion(int x) {return x>=2;}
}
