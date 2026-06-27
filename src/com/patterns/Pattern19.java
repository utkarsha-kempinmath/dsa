package com.patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j=1; j<= 2*n; j++){
                if(j<=(n-i+1) || j>=((n+i))){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
