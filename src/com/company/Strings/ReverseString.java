package com.company.Strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {


    public static void main(String[] args) {
        String s = "I Hate you";
        int Length = s.length();

//        for (int i = Length-1; i >= 0; i--) {
//            System.out.print(s.charAt(i));
//
//        }



        //split the words based on regex Expressions

//        for (String word:s.split(" "))
//        {
//            System.out.println(word);
//
//        }




//        INPUT----    I HATE YOU
//        OUTPUT---    YOU HATE ME



        List<String>splitted_words=new ArrayList<>();
        for (String word:s.split(" "))
        {
            splitted_words.add(word);

        }
        System.out.println(splitted_words.size());

       for (int i= splitted_words.size()-1;i>=0;i--)
       {
           System.out.println(splitted_words.get(i));
       }













    }
}
