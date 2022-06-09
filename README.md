# A quick Handbook for algorithms

## Array

### Duplicate Item

**HashSet Hack**

### [Maximum Sub Array](https://leetcode.com/problems/maximum-subarray)

### Bruteforce

Timelimit

### [Kadane's Algorithm](https://medium.com/@rsinghal757/kadanes-algorithm-dynamic-programming-how-and-why-does-it-work-3fd8849ed73d#:~:text=The%20maximum%20subarray%20problem%20is,1%E2%80%A6n%5D%20of%20numbers.&text=For%20example%2C%20for%20the%20array,1%5D%2C%20with%20sum%206.)
```
  Algo: local_maximum[i] = max(A[i], A[i] + local_maximum[i-1])
  
  int maxSumSubArray(int[] A) {
    n = A.length
    local_max = 0
    global_max = Integer.MIN_VALUE
    
    loop 0 ... n-1
      local_max = max(A[i], A[i]+local_max);
      if local_max > global_max
        global_max = local_max
  }
```

# Search

## Binary Search

```
min=0 max=n-1
while min<=max
    mid=min+(max-min)/2
    if arr[mid] < target
        min=mid+1
    else if arr[mid] > target
        max=mid-1
    else
        return mid

return -1
```

## Sort

### Bubble sort

```
    loop 0 ... n-2
        loop 0 ... n - loop1 - 2
            if item[loop2] > item[loop2+1]
                swap (item[loop2], item[loop2+1])
```