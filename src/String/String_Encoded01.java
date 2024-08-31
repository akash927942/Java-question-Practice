package String;

public class String_Encoded01 {
    public static void main(String[] args) {
        String s="11101111011111";
        String ans="";
        int count=0;
        for (int i=0;i<s.length();i++){
           if (s.charAt(i)=='1'){
               count++;
           }
           else {
               char c=(char)(count-1+'A');
               ans +=c;
               count=0;
           }

        }
        if(count>0){
            char c=(char)(count-1+'A');
            ans +=c;
        }
        System.out.println(ans);
    }
}
