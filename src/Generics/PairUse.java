package Generics;


import java.util.Scanner;

public class PairUse {
    public static void main(String[] args){
        Pair<Integer,Integer> p=new Pair<>(1,2);
        System.out.println(p.get_first());
        Pair<String,Integer> p1=new Pair<>("Ak",2);
        System.out.println(p1.get_first());
        p1.set_first("Akash");
        System.out.println(p1.get_first());
    }
}
