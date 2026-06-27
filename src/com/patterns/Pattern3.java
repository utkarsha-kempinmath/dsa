package com.patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ascii = n + 64;
        for(int i=65; i<=ascii; i++){
            for(int j=65; j<=ascii; j++){
                System.out.print((char)(j) + " ");
            }
            System.out.println();
        }
    }
}
