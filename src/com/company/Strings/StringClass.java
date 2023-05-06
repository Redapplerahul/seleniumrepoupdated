package com.company.Strings;


class A {
    String str = "Raghava";
}


public class StringClass {
    public static void main(String[] args) {

        A object = new A();
        System.out.println(object.str);
        String newstr = "Raghava";
        System.out.println(newstr);
        System.out.println(object.str.equals(newstr));
        boolean b = object.str == newstr;
        System.out.println(b);


        String immutuable = "Immutuable";
        String im1="Immutuable";
        String im2="Immutuable";
        System.out.println(im2);
        immutuable = immutuable + "string";

        System.out.println(immutuable);
        System.out.println(im1);
        System.out.println(immutuable.concat("In_Java"));


    }
}