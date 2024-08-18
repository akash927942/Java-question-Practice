package Practice;

import java.util.ArrayList;
import java.util.List;

public class CombinationPlayer {
    public static void main(String[] args) {
        int [ ]skills={12,4,6,13,5,10};
        int minp=3;
        int minl=4;
        int maxl=10;

        List<Integer> vp=new ArrayList<>();
        for (int i=0;i<skills.length;i++){
            if (minl <= skills[i] && maxl >= skills[i]){
                vp.add(skills[i]);
            }
        }

    }
}
