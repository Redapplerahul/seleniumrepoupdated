package Hackerrank;
import java.util.Scanner;
public class Stdinout  {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        String next="I Love You";//static way

        String Dynamic_Way=scan.nextLine();



        //If we use next() for strings it will take upto only 1st white space
        // Exampe---Welcome to java---------o/p--------->Welcome



//        while(scan.hasNext())
//        {
//            s=scan.nextLine();
//        }
//        scan.close();
        System.out.println("String  next() in a static way: " + next);
        System.out.println("String  nextLine() in a  dynamic way: " + Dynamic_Way);
        System.out.println("Double: " +d);
        System.out.println("Int: " + i);

    }
}

