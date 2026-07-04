package com.recursion;

import java.util.Scanner;

public class DecreasingIncreasingPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        fun(n);
    }
    public static void fun(int n){
        if(n==0) return;
        int n1=n;
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
}
