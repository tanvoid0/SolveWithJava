package com.tanvoid0.java.data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListProblem {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> arr = new ArrayList<>();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            List<String> sub_arr = new ArrayList<>(Arrays.asList(str.split(" ")));
            List<Integer> sub_int = new ArrayList<>();
            for (String item : sub_arr) {
                sub_int.add(Integer.valueOf(item));
            }
            arr.add(sub_int);
        }
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            try {
                System.out.println(arr.get(a-1).get(b));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
