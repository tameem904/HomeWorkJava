package javaHw;

import java.util.Scanner;

public class StringMethodHw03 {

    public static void main(String[] args) {
        /* Write a program that reads two people's first names and if they are expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Mom's first name?");
        String momName= scan.next();
        System.out.println("dad's first name?");
        String dadName=scan.next();
        System.out.println("expecting boy or girl?");
        String gender= scan.next();
        String babyName;

        if(gender.equalsIgnoreCase("boy")){
           dadName=dadName.substring(0,2);
            momName=momName.substring(2,4);
            System.out.println("suggested baby name "+ dadName+momName);
        }
        else if (gender.equalsIgnoreCase("girl")){
            momName=momName.substring(0,2);
            dadName= dadName.substring(3,6);
            String totalName=  momName+dadName;
            System.out.println("suggested baby name "+totalName.toUpperCase() );
        }
    }
}