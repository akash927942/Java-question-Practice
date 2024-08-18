package String;

public class Remove_spaces_from_a_string {
    public static void main(String[] args) {
        String s="Akash Kumar is a good boy";
        //System.out.println(s);
        String ns="";
        for (int i=0;i<s.length();i++){
            if(s.charAt(i) !=' '){
                ns += ""+s.charAt(i);
            }
        }
        System.out.println(s);
        System.out.println(ns);
    }
}
