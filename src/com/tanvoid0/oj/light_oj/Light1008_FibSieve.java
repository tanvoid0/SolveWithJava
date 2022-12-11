package com.tanvoid0.oj.light_oj;

import java.util.Scanner;

public class Light1008_FibSieve {
    static final int max = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] arr = new int[max][max];
        initArray(arr);
        for (int i=0; i<t; i++) {

        }
    }

    public static void initArray(int[][] arr) {
        int r = 0, c = 0, steps = 1, num =1;

        arr[r][c] = num++;

        r++;
        int start = c, end = c+steps;
        for (int i=start; i<=end; i++) {
            arr[r][c++] = num++;
        }
        c--;
        r--;
        start = r; end = 0;
        for (int i=start; i>=end; i++) {
            arr[r--][c] = num++;
        }
        c++;
        steps++;

        start = r; end = r + steps;
        for (int i=start; i<=end; i++) {
            arr[r++][c] = num++;
        }

    }

}
