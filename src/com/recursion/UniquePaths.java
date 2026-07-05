package com.recursion;

import java.util.Scanner;

//not a good way
public class UniquePaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println(uniquePaths(m,n));
    }
    public static int uniquePaths(int m, int n){
        if(n==1 || m==1) return 1;
        return uniquePaths(m-1, n)+uniquePaths(m, n-1);
    }
}
