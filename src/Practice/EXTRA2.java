package Practice;

import test.Str;

import java.util.Arrays;
import java.util.Stack;

public class EXTRA2 {
    public static String abc(String a,int b){
        if(a.length()==0){
            return "-1";
        }
        char last=a.charAt(0);
        StringBuilder sb=new StringBuilder();
        for (int i=1;i<a.length();i++){
            if (a.charAt(i)>='a' && a.charAt(i)<='z'){
                last=a.charAt(i);
            }
            if (a.charAt(i)>='1' && a.charAt(i)<='9'){
                int n=a.charAt(i)-'0';
//              System.out.println(n);
                for (int j=0;j<n;j++){
                    sb.append(last);
                }
            }
        }
        String s= sb.toString();
        String ans=""+s.charAt(b);
        System.out.println(sb.toString());
        return ans;
    }


    
    public static void main(String[] args) {

        String s="a2b2c2d1";
    int a=5;
        System.out.println(abc(s,a));







    }
}
