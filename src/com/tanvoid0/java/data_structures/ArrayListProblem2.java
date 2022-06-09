package com.tanvoid0.java.data_structures;

import java.util.*;

public class ArrayListProblem2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String cmd = sc.nextLine();
            if (cmd.contains("Insert")) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr.add(a, b);
            } else if (cmd.contains("Delete")) {
                int a = sc.nextInt();
                arr.remove(a);
            }
        }
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()) {
            System.out.print(it.next());
            if(it.hasNext()) System.out.println(" ");
        }
    }
}
