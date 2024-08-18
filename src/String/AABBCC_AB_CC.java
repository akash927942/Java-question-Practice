package String;

import test.Str;

import java.util.HashMap;

public class AABBCC_AB_CC {
    public static void main(String[] args) {
        String s1="AzzABBCC";
        String s2="ABz";
        HashMap<Character,Integer> hm=new HashMap<>();
        for (int i=0;i<s1.length();i++){
            //int a=s1.charAt(i);
            if(hm.containsKey(s1.charAt(i))){
                hm.put(s1.charAt(i),hm.get(s1.charAt(i))+1);
            }
            else {
                hm.put(s1.charAt(i),1);
            }
        }
        for (int i=0;i<s2.length();i++){
            if (hm.containsKey(s2.charAt(i))){
                hm.remove(s2.charAt(i));
            }
        }
        String ans="";
        for (int i=0;i<s1.length();i++){
            if(hm.containsKey(s1.charAt(i))){
                ans +=""+s1.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
