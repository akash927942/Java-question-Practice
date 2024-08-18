package String;

public class CaseChange {
    public static void main(String[] args) {
        String s1="AkAshH";
        int lc=0;
        int uc=0;
        for (int i=0;i<s1.length();i++){
            if(s1.charAt(i)>='A' && s1.charAt(i)<='Z'){
                uc++;
            }
            else {
                lc++;
            }
        }
        if (lc>uc){
            s1=s1.toLowerCase();
        }
        else {
            s1=s1.toUpperCase();
        }
        System.out.println(lc+""+uc);
        System.out.println(s1);
    }
}
