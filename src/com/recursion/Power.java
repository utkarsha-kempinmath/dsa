package com.recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("a^b = "+ pow(a,b));
    }
//    public static int pow(int a, int b){
//        if(b==0) return 1;
//        return a*pow(a,b-1);
//    }
    public static int pow(int a, int b){
        if(b==1) return a;
        if(b%2!=0) return pow(a,b/2)*pow(a,b/2)*a;
        return pow(a,b/2)*pow(a,b/2);
    }
}
