package Practice;

import test.Str;

import java.util.Arrays;

public class Extra {
    public static void main(String [] args)
    {
        int a=3;
        char as='a';
        System.out.println((char) (as-32));
        String s="akash kumar is a good boy";
        String[] sp=s.split(" ");
        System.out.println(Arrays.toString(sp));
       boolean sa=true;
       if (sa){
           System.out.println("yas");
       }

        StringBuilder sb=new StringBuilder();
        sb.append((char)(s.charAt(0)-32));

        for (int i=1;i<s.length();i++){
            if (s.charAt(i)==' '){
                sb.append(' ');
                sb.append(Character.toUpperCase(s.charAt(i+1)));
                i++;
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());


    }
}
