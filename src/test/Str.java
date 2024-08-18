package test;

import java.util.Scanner;

public class Str {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        int a=A.length();
        int b=B.length();
        System.out.println(a+b);
        String s1=A.substring(0,1).toUpperCase()+A.substring(1);


        System.out.println(s1);


    }
}
