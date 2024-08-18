package String;

public class Palindrome {
    public static void main(String[] args) {
        String s="abcdvcdcba";
        int last=s.length()-1;
        boolean ans=true;
        for(int i=0;i<=last;i++,last--){
            if (s.charAt(i) !=s.charAt(last)){
                System.out.println("not palindrom");
                ans=false;
                break;

            }

        }
        if(ans ==true){
            System.out.println("palindrome");
        }
    }
}
