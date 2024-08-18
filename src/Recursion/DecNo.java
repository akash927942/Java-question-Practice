package Recursion;

import java.util.Scanner;

public class DecNo {
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        noprint(n);

        System.out.println("ajj");
    }

    public static void noprint(int n){
        System.out.println(n);
            if (n>1) {
                noprint(n - 1);
            }

    }
}
