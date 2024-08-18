package String;

public class AlternateUpper_Lower {
    public static void main(String[] args) {
        String s="Akash KUmar";
        StringBuilder sb= new StringBuilder();
        String ns="";
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){

                sb.append(' ');
                continue;
            }
            if(i%2!=0){
                ns +=Character.toUpperCase(s.charAt(i));
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else {
                ns +=Character.toLowerCase(s.charAt(i));
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println(ns);
        System.out.println(sb.toString());
    }
}
