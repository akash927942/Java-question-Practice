package HashMap;

import java.util.HashMap;
import java.util.Set;

public class IterationonHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",140);
        hm.put("US",40);
        hm.put("China",150);
        hm.put("uk",140);
        hm.put("India",140);

        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for (String s:keys) {
            System.out.println("keys "+s+" val "+hm.get(s));
        }
    }
}
