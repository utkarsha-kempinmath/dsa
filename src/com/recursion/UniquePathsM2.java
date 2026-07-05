package com.recursion;

import java.util.Scanner;

public class UniquePathsM2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println(uniquePaths(0,0, m-1, n-1));
    }
    public static int uniquePaths(int cr, int cc, int lr, int lc){
        if(cr==lr && cc==lc) return 1;
        if(cr>lr || cc>lc) return 0;
        int right = uniquePaths(cr, cc+1, lr, lc);
        int down = uniquePaths(cr+1, cc, lr, lc);
        return right+down;
    }
}
