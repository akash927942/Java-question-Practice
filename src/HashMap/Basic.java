package HashMap;

import java.util.HashMap;

public class Basic {
    /*
    Hashing-> 1-map 1.1-Hashmap
                    1.2-LinkedHashmap
                    1.3-TreeMap
              2-set 2.1-hashset
                    2.2-Linkedhashset
                    2.3-treeset

     */

    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        //put O(1)
        hm.put("aka",100);
        hm.put("kau",101);
        hm.put("pan",102);

        System.out.println(hm);

        //O(1)
        System.out.println(hm.get("aka"));

        //O(1)
        System.out.println(hm.containsKey("aka"));

        //remove O(1)
        System.out.println(hm.remove("kau"));

        //size
        System.out.println(hm.size());

    }
}
