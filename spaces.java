package Hackerrank;

import java.util.Scanner;

public class spaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        String s1 = sc.next();
        int x = sc.nextInt();

        System.out.printf("%-14s %03d\n", s1, x);

        System.out.println("================================");
        sc.close();
    }


}

