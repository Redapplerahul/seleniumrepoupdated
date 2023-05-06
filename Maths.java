package Hackerrank;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
public class Maths {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
           for (int k=1;k<=2;k++)
           {
               int a=scanner.nextInt();
               int b=scanner.nextInt();
               int n=scanner.nextInt();
               int computed=a;
               for (int i = 0; i < n; i++)
               {
                   int sum = (int) ((Math.pow(2, i)) * b);
                   computed = sum + computed;
                   System.out.print(computed + " ");
               }
           }
    }
}
