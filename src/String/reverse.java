package String;

public class reverse {
    public static void main(String[] args) {
        String s="akash";
        StringBuilder sb=new StringBuilder ();
        System.out.println(s.length());
        for (int i=(s.length()-1);i>=0;i--){
            sb.append(s.charAt(i));
        }
        s=sb.toString();
        System.out.println(s);
    }
}
