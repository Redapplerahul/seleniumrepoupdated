package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1;
        int c=a+b;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       System.out.println(a +" " + b);
        for (int i=3;i<=n;i++)
        {
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }

    }
}
