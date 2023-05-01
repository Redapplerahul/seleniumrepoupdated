package com.company;
import java.util.Scanner;
public class Largest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
//if(a>b)
//{
//    if(a>c)
//    {
//        System.out.println(" A is maximum");
//    }
//    else {
//        System.out.println(" B is maximum");
//    }
//}
//if (b>a) {
//    if (b > c) {
//        System.out.println(" b is maximum");
//
//    } else {
//        System.out.println("c is maximum");
//    }
//}
//
//
        int max=a;
        if(b>max)
        {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }

        System.out.println(max);
    }
}
