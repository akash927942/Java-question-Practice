package Practice;

import test.Str;

import java.util.ArrayList;

public class forLOOp {
    public static void main(String[] args){
        long st=System.currentTimeMillis();
        int[] arr={1,2,3,4,5,5,6,7};
        for(int v:arr){
            System.out.println(v);
        }
        String s="Akash";


        //char[]c=s.toCharArray();
        StringBuilder sb=new StringBuilder();

        for (char c:s.toCharArray()){
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            }
            if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }

        }
        System.out.println(sb);

        ArrayList<Long> ar=new ArrayList<>();
        for (long i =2;i<9999900;i++){
            //i=i*i;
            ar.add(i);

        }
        long endt=System.currentTimeMillis();
        System.out.print(endt-st);
    }



}
