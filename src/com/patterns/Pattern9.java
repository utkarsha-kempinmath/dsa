package com.patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%2 != 0){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j == (n / 2)+1) {
                        System.out.print("* ");
                    } else if (i == (n/2)+1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        else{
            System.out.println("enter odd no!!");
            main();
        }
    }
}
