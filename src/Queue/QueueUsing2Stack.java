package Queue;

import java.util.Stack;

public class QueueUsing2Stack {



        //Define the data members
        Stack <Integer>s1;
        Stack <Integer>s2;
        int size;


        public QueueUsing2Stack() {
            //Implement the Constructor
            s1=new Stack<Integer>();
            s2=new Stack<Integer>();
            size=0;
        }



        /*----------------- Public Functions of Stack -----------------*/


        public int getSize() {
            //Implement the getSize() function
            return size;
        }

        public boolean isEmpty() {
            //Implement the isEmpty() function
            return size==0;
        }

        public void push1(int element) {
            //Implement the push(element) function
            s1.push(element);
            size++;
        }

        public int pop1() {
            //Implement the pop() function
            if(size==0){
                return -1;
            }
            for(int i=0;i<=s1.size();i++){
                int a=s1.pop();
                s2.push(a);
            }
            int ans=s2.pop();
            for(int i=0;i<=s2.size();i++){
                int a=s2.pop();
                s1.push(a);
            }
            size--;


            return ans;

        }

        public int top() {
            //Implement the top() function
            if(size==0){
                return -1;
            }
//            for(int i=0;i<=s1.size();i++){
//                int a=  s1.pop();
//                s2.push(a);
//            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int ans=s2.peek();
            for(int i=0;i<=s2.size();i++){
                int a=s2.pop();
                s1.push(a);
            }
            return ans;
        }
        public static void main(String[] args) {
            QueueUsing2Stack q1=new QueueUsing2Stack();
            //q1.push1(1087);
            q1.push1(1);
            q1.push1(2);
            q1.push1(3);
           // System.out.println(q1.getSize());
            System.out.println(q1.top());
            System.out.println(q1.pop1());
            System.out.println(q1.top());
            q1.push1(4);
            q1.push1(5);

            q1.push1(6);
            System.out.println();



        }
    }
