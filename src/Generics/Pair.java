package Generics;

public class Pair<T,V> {
   private T first;
   private V second;

   Pair(T first,V second){
       this.first=first;
       this.second=second;
   }
   public T get_first(){
       return first;
   }
   public void set_first(T first){
       this.first=first;
   }
   public V get_second(){
       return second;
   }
   public void set_second(V second){
       this.second=second;
   }

}
