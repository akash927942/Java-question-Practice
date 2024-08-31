package String;

public class longestSubstring {
    public static void main(String[] args) {
        String s1="adventure";
        String s2="future";
        String ans="";

        for (int i=0;i<s1.length();i++){
            for (int j=i+1;j<=s1.length();j++){
                String sub=s1.substring(i,j);
                if (s2.contains(sub) && ans.length()<sub.length()){
                    ans=sub;
                }
            }
        }
        int anssuum=0;
        for (char c:ans.toCharArray()){
            anssuum +=c;
        }

        System.out.println(ans +""+anssuum);
    }
}
