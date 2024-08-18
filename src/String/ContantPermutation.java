package String;

public class ContantPermutation {
    public static void main(String[] args) {

        String s="CDFA";
        String vowel="AEIOUaeiou";
        int count=0;
        for (int i=0;i<s.length();i++){
            if (vowel.indexOf(s.charAt(i))==-1){
                count++;
            }
        }
        int ans=1;
        for (int i=count;i>0;i--){
            ans *=i;
        }
        System.out.println(ans);
        System.out.println(count);
    }
}
