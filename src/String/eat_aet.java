package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class eat_aet {
    public static void main(String[] args) {
        String s="ezateiv";
        char [] s1=s.toCharArray();
        System.out.println(Arrays.toString(s1));
        ArrayList<Character> vowel=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c=='a' ||c=='e' ||c=='i'||c=='o'||c=='u'){
                vowel.add(c);
            }
        }
        Collections.sort(vowel);
        StringBuilder sb=new StringBuilder();
        int count=0;
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' ||c=='e' ||c=='i'||c=='o'||c=='u'){
                sb.append(vowel.get(count));
                count++;
            }
            else {
                sb.append(c);
            }
        }
        String abs=sb.toString();
        System.out.println(sb);
    }
}
