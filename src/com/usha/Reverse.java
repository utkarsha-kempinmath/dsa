package com.usha;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num: ");
        int num = input.nextInt();
        int ans = 0;
        while(num != 0){
            int temp = num % 10;
            ans = ans*10 + temp;
            num = num/10;
        }
        System.out.println("the reverse of num is: " + ans);
    }
}
