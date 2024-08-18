package Queue;

import test.Str;

import java.util.Scanner;

public class queue {
    private int data[];
    private int front;
    private int rear;
    private int size;
    public queue(){
        data=new int[10];
        front=-1;
        rear=-1;
        size=0;
    }
    public queue(int ele){
        data=new int[ele];
        front=-1;
        rear=-1;
        size=0;
    }

    int size(){
        return size;
    }

    boolean isempty(){
        return size==0;
    }

    int front() throws EmptyException {
        if (size==0) {
            throw new EmptyException();
        }
            return data[front];

    }

    void enqueue(int ele) throws QueueOverflow {
        if (size== data.length){
            throw new QueueOverflow();
        }
        if (size==0){
            front++;
        }

        rear=(rear+1)% data.length;
//        rear++;
//        if (rear==data.length){
//            rear=0;
//        }
        size++;

        data[rear]=ele;
    }
    int dequeue() throws EmptyException {
        if (size==0) {
            throw new EmptyException();
        }
        int temp=data[front];

        front=(front+1)% data.length;
//        front++;
//        if(front== data.length){
//            front=0;
//        }
        size--;
        if (size==0){
            front=-1;
            rear=-1;
        }
        return temp;
    }

    public static void main(String[] args) throws QueueOverflow, EmptyException {
        Scanner sc=new Scanner(System.in);
        queue q1=new queue(3);
        q1.enqueue(5);
        q1.enqueue(10);
        q1.enqueue(15);
        q1.dequeue();
        q1.enqueue(150);
       // System.out.println(q1.dequeue());
        System.out.println(q1.size());
        System.out.println(q1.front());
    }
}
