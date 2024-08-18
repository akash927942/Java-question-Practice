package Recursion;

import java.util.Scanner;

public class fibonaciNo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(fab(a));
    }
    public static int fab(int n){
        if(n==0 || n==1){
            return 0;
        }
        return fab(n-1)+fab(n-2);
    }
}
