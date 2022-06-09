package com.tanvoid0.java.data_structures;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int neg = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j+i<n; j++) {
                int total = 0;
                for (int k=j; k<=j+i; k++) {
                    total += arr[k];
                }
                if(total < 0) neg++;
            }
        }

        System.out.println(neg);
    }
}
