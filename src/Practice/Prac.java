package Practice;

import java.util.Arrays;
//import java.util.Scanner;

public class Prac {

    public static  String longestCommonPrefix(String[] strs) {
        StringBuilder ans=new StringBuilder();
        String first=strs[0];
        String last=strs[strs.length-1];

        for (int i=0;i<first.length() && i<last.length();i++){
            if(first.charAt(i)!=last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }




        return ans.toString();
    }
        public static void main(String [] args)
    {
//        Scanner sc=new Scanner(System.in);
//        int ar[]={1,5,6,4,8521,4854,12,4,8,0,5455,45,4,0,78,48};


        String [] strs = {"flower","flow","flight"};
        //Arrays.sort(strs);
        System.out.println("original arr"+"\n"+Arrays.toString(strs));
//        Prac.longestCommonPrefix(strs);
       String ans= Prac.longestCommonPrefix(strs);
        System.out.println("Sorted arrays"+"\n"+ ans);




    }
}
