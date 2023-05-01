package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println(" enter two numbers ");
        Scanner input=new Scanner(System.in);
        float num1= input.nextFloat();
        float num2=input.nextFloat();
        float sum=num2+num1;
        System.out.println("sum of two numbers is " +sum);
    }
}
