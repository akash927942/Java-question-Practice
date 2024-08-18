package Recursion;

import java.util.Scanner;

public class sumofNnaturalNo {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sns=sum(n);
        System.out.println(sns);

    }
  public static int sum(int n){

        if (n==1){
            return 1;
        }
        int res= n *sum(n-1);


        return res ;
  }

}
