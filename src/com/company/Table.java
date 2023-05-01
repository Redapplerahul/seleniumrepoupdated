package com.company;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
// 5*1=5
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(in +"*" +  i + "=" + in*i);
        }
}
}
