package Recursion;

import java.util.Scanner;

public class IncNo {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Incnum(n);
    }
    public static void Incnum(int n){
        if(n==0){
            return;
        }

        Incnum(n-1);
        System.out.println(n);
    }
}
