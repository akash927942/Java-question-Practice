package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        int [] a={644,5,5,74,5484,54,845,184,51,8,78445,18,1,84,55,484,5};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(59);
        list1.add(5);
        list1.add(56);

        Collections.sort(list1);
        System.out.println(list1);
    }

}
