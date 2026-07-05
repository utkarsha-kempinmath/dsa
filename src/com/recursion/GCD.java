package com.recursion;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(gdc(n,m));
    }
    public static int gdc(int n, int m){
        if(n==0) return m;
        return gdc(m%n, n);
    }
}
