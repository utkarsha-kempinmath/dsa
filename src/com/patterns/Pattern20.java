package com.patterns;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<= (n*2) -1; i++){
            for(int j=1; j<= (n*2) -1; j++){
                int a=i;
                int b=j;
                if(i>n) a = 2*n - i;
                if(b>n) b = 2*n - j;
                System.out.print(Math.min(a,b) + " ");
            }
            System.out.println();
        }
    }
}
