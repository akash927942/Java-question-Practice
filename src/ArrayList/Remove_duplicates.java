package ArrayList;

import java.util.*;

public class Remove_duplicates {
    public static void main(String[] args) {
        int[] a={1,5,1,6,4,2,6,5,7,9,3,0,4,2,1,0,5,7,9};
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        System.out.println(set);
        List<Integer> na=new ArrayList<>(set);
        System.out.println(na);


    }
}
