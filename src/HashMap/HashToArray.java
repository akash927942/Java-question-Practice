package HashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashToArray {
    public static void main(String[] args) {
        LinkedHashSet<Integer> h1=new LinkedHashSet<>();
        h1.add(10);
        h1.add(20);
        h1.add(30);
        h1.add(40);
        h1.add(50);

        ArrayList<Integer> al=new ArrayList<>();
        for (int a:h1){
            al.add(a);
        }
        System.out.println(al);

    }
}
