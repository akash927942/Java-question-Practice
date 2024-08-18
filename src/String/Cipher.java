package String;

import test.Str;

public class Cipher {
    public static void main(String[] args) {
        String s="abcdzyxw";
        int n=3;
        StringBuilder sb =new StringBuilder();

        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z'){
                char nc=(char)(c+n);
                if (nc>='a' && nc<='z'){
                    sb.append(nc);
                }
                else {
                    nc=(char)(nc-26);
                    sb.append(nc);
                }
            }
            else {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
