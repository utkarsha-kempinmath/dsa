package com.recursion;

import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(" reverse is: " + reverseOfNum(n, 0));
    }
    public static int reverseOfNum(int num, int numRev){
        if(num==0) return numRev;
        numRev = 10*numRev + num%10;
        return reverseOfNum(num/10, numRev);
    }
}
