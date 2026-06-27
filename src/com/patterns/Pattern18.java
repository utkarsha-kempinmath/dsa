package com.patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j=1; j<= 2*n; j++){
                if(j<=(n-i) || j>=((n+i))){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<= 2*n; j++){
                if(j <= (n - i) || j >= (n + i)){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
