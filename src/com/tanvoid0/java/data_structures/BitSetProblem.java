package com.tanvoid0.java.data_structures;

import java.util.BitSet;
import java.util.Scanner;

public class BitSetProblem {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BitSet b1 = new BitSet(0);
        BitSet b2 = new BitSet(0);
        int N, M;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        for (int i = 0; i < N; i++) {
            sc.nextLine();
            String cmd = sc.nextLine();
            String[] str = cmd.split(" ");
            int a = Integer.valueOf(str[1]);
            int b = Integer.valueOf(str[2]);

            if (str[0].equals("AND")) {
                if (a == 1) {
                    b1.and(b2);
                } else {
                    b2.and(b1);
                }
            } else if (str[0].equals("SET")) {
                if (a == 1) {
                    b1.set(b, true);
                } else if (a == 2) {
                    b2.set(b, true);
                }
            } else if (str[0].equals("FLIP")) {
                if (a == 1) {
                    b1.flip(b);
                } else if (a == 2) {
                    b2.flip(b);
                }
            } else if (str[0].equals("OR")) {
                if (a == 1) {
                    b1.or(b2);
                } else {
                    b2.or(b1);
                }
            }
            System.out.println(b1+ " " + b2);
        }
    }
}
