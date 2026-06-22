package com.usha;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num: ");
        int num =  input.nextInt();
        System.out.println("enter single digit n: ");
        int n = input.nextInt();
        if(n/10 != 0){
            System.out.println("enter single digit!!");
            n = input.nextInt();
        }
        int count = 0;
        while(num != 0){
            int temp = num % 10;
            if(temp == n) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
