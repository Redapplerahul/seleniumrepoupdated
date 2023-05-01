package com.company;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        System.out.println("converting int to char");
        // 65-90=A-Z
        //97-122=a-z
        //or(int i=65;i<=122;i++)
        //
        //   System.out.println((char)(i));
        //
        Scanner in = new Scanner(System.in);
        char ch=in.next().trim().charAt(0);
        if(ch>='a'&&ch<='z')
        {
            System.out.println("l");
        }
        else {
            System.out.println("u");
        }
    }
}
