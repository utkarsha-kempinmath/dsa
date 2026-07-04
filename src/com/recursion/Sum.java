package com.recursion;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sum(n, 1));
    }
    public static int sum(int n, int x){
        int sums = 0;
        if(x>n) return sums;
        sums = sums + x + sum(n, x+1);
        return sums;
    }
}
