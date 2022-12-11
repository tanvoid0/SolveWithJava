package com.tanvoid0.oj.light_oj;

import java.util.*;

public class Light1001_OppositeTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[] res = getOppositeTask(n);
            System.out.println(res[0] + " " + res[1]);
        }
    }

    public static int[] getOppositeTask(final int number) {
        int a, b;
        if (number == 0) {
            a=b=0;
        }
        else if (number > 10) {
            a = number - 10;
            b = 10;
        } else {
            Random rand = new Random();
            a = rand.nextInt(number);
            b = number - a;
        }
        return new int[] {a, b};
    }
}
