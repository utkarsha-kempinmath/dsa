package com.recursion;

import java.util.Scanner;

public class PowOfRev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = 0;
        int[] num = new int[1];
        num[0] = n;
        while (num[0] != 0) {
            b = b*10 + num[0]%10;
            num[0]=num[0]/10;
        }
        System.out.println("reverse is: " + b);
        System.out.println(n);
        System.out.println("power of rev is: " + powOfRev(n, b));
    }
    public static int powOfRev(int a, int b){
        if(b==0) return 1;
        if(b==1) return a;
        int half = powOfRev(a, b / 2);
        if (b % 2 == 0)
            return half * half;
        else
            return half * half * a;
    }
}
