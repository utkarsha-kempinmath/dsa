package com.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fact = fac(n);
        System.out.println(fact);
    }
    public static int fac(int n){
        if(n==1 || n==0) return 1;
        return n*fac(n-1);
    }
}
