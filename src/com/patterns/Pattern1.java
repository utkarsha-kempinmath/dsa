package com.patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int col = in.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
