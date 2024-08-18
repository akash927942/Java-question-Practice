package Stack;

import java.util.Scanner;
import java.util.Stack;

public class stack {
    int data[];
    int top;

    public stack(){
        data=new int[10];
        top=-1;
    }
    public stack(int size){
        data =new int[size];
        top=-1;
    }

    public int size(){

        return top+1;
    }
    public int top() throws ExecptionEmpty {
        if (size()==0){
            ExecptionEmpty e=new ExecptionEmpty();
            throw e;
        }

        return data[top];
    }

    public boolean empty(){
        return (top==-1);
    }
    public void push(int ele) throws ExecptionEmpty {
        if (size()== data.length){
            int data2[]=new int[(size()*2)];
            for (int i=0;i<=top;i++){
                data2[i]=data[i];
            }
            data=data2;
        }

        top++;
        data[top]=ele;
    }

    public void pop(){
        if (size()==0){
            System.out.println("empty");
        }
        else{
        top--;}
    }



    public static void main(String [] args) throws ExecptionEmpty {
        Scanner sc=new Scanner(System.in);
        stack s=new stack(5);
        s.push(10);
        s.push(20);
        s.push(20);
        s.push(20);
        s.push(200);
        s.push(2001);


        //s.pop();
        boolean a=s.empty();
        int b=s.top();
        int c=s.size();
        System.out.println(s.data.length);
        System.out.println(b);
        System.out.println(a);
        System.out.println(c);


        //Inbuilt Function
        Stack<Integer> ak=new Stack<>();
        ak.push(40);
        int ap=ak.pop();
        int as=ak.peek();
        System.out.println(ak.empty());
        System.out.println(as);
        //System.out.println(ak.size());
    }
}
