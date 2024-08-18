package ArrayList;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String s=" Akash,Kumar is;a.good boy ";
        s=s.trim();
        System.out.println(s);

        String[] s1=s.split("[, ;.]");
        System.out.println(Arrays.toString(s1));
        for (int i=0;i<s1.length;i++){
            System.out.println(s1[i]);
        }
    }
}
