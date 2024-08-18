package ArrayList;
import java.util.*;

import java.util.ArrayList;

public class Arrlist {
    public static void main(String[] args){
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(59);
        list1.add(5);
        list1.add(56);
        list1.add(2,99);
        System.out.println(list1.toString());
        System.out.println(list1.get(1));
        list1.set(3,9);
        list1.remove(1);
        System.out.println(list1.toString());
        System.out.println(list1.get(1));
        System.out.println(list1.size());
        ArrayList<Integer> list2=new ArrayList<>();


//        List<Integer> l1 = new ArrayList<Integer>();sou
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);



    }

}
