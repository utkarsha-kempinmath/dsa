package com.usha;

import java.util.Scanner;

public class FiboSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0;
        int sec = 1;
        int n = input.nextInt();
        int ans;
            for (int i = 1; i < n; i++) {
                if(i == 1){
                    ans = first;
                    System.out.println(ans);
                }
                if (i == 2){
                    ans = sec;
                    System.out.println(ans);
                }

                ans = first + sec;
                first = sec;
                sec = ans;
                System.out.println(ans);
            }
    }
}
