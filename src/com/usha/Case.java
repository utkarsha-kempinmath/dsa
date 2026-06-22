package com.usha;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the word");
        String word = input.next();
        char ch = word.trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("lower case");
        }
        else if(ch >= 'A' && ch<='Z'){
            System.out.println("upper case");
        }
        else{
            System.out.println("invalid word");
        }
    }
}
