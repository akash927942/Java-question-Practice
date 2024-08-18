package test;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class extra {

    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
       long n=sc.nextLong();
       if (n>Byte.MIN_VALUE && n<Byte.MAX_VALUE) {
           System.out.println(n + " can be fitted in:" + "\n" + "* byte" + "\n" + "* short" + "\n" + "* int" + "\n" + "* long");
       }
       if (n>Integer.MIN_VALUE && n<Integer.MAX_VALUE){
           System.out.println("Integer"+"\n"+"d");
       }
//       if (n>)

    }
}
