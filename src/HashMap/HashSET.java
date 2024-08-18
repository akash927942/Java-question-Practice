package HashMap;

import java.util.HashSet;
import java.util.Iterator;

public class HashSET {
    public static void main(String[] args) {
        HashSet<String > set=new HashSet<>();
        set.add("Aka");
        set.add("akash");
        set.add("Bihar");
        set.add("CGU");
        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //Common method
        System.out.println("common method");
        for (String city:set){
            System.out.println(city);
        }

    }
}
