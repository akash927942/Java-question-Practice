package String;

public class StringCompress {
    public static void main(String[] args) {
        String s="abaaaasasffsswe";
        StringBuilder ans=new StringBuilder();

        char PCurrent=s.charAt(0);
        int count=1;
        for (int i=1;i<s.length();i++){
            char c=s.charAt(i);

            if (PCurrent == c){
                count++;
            }
            if(PCurrent != c)  {
                ans.append(PCurrent);
                if (count>1){
                    ans.append(count);
                }
                PCurrent=c;
                count=1;
            }


        }
        ans.append(PCurrent);
        if (count>1){
            ans.append(count);
        }

        String anss=ans.toString();
        System.out.println(anss);
    }
}
