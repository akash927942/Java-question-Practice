package Stack;

import java.util.Scanner;

public class stackUsingLL <T>{
    Node<T> head;
    int size;

    public stackUsingLL(){
        head=null;
        size=0;
    }
    public int size(){
        return size;
    }
    public T top(){
        return head.data;
    }
    public boolean isempty(){
        if (head==null){
            return true;
        }
        return false;
    }
    public void push(T ele){
        if (head==null){
            Node<T> nodenew=new Node<>(ele);
            head=nodenew;
            size++;
        }
        else{
            Node<T> newNode=new Node<>(ele);
            newNode.next=head;
            head=newNode;
            size++;
        }
    }
    public void pop(){
        if(head==null){
            System.out.println("empty Stack");
        }
        else{
            head=head.next;
            size--;
        }
    }


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        stackUsingLL <Integer> stack=new stackUsingLL<>();
        stack.push(10);
        stack.push(105);
        stack.push(10556);
        stack.push(1450);
        stack.pop();
       int a=stack.top();
        System.out.println(a);
        System.out.println(stack.top());
        System.out.println(stack.size());
        System.out.println(stack.isempty());

    }
}
