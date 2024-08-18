package String;

public class alagaram {
    public static void main(String[] args) {
        String s1="akasha";
        String s2="Aashka";
        s2=s2.toLowerCase();
        s1=s1.toLowerCase();

        int[] ar=new int[26];

        for (int i=0;i<s1.length();i++){
            ar[s1.charAt(i)-'a']++;
            ar[s2.charAt(i)-'a']--;
        }
        boolean ans=true;
        for (int i=0 ;i< ar.length;i++){
            if (ar[i] !=0){
                ans=false;
                break;
            }
        }
        System.out.println(ans);
    }
}
