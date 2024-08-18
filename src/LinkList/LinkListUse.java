package LinkList;

import java.util.Scanner;

public class LinkListUse {

    public static void print(Node<Integer> head){
        while(head !=null){
            System.out.print(head.data + " ");

            head=head.next;
        }
        System.out.println();
    }
    public static Node<Integer> input(){
        Node<Integer> head=null,tail=null ;
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();

        while (data !=-1){
            Node<Integer> newNode=new Node<>(data);
            if(head==null) {
                head=newNode;
                tail=newNode;
            }
            else {
                tail.next=newNode;
                tail=newNode;
            }


            data=sc.nextInt();
        }


        return head;
    }

    public static Node<Integer> insert(Node<Integer> head , int data, int pos){
        Node<Integer> NewNode=new Node<>(data);

        int i=0;
        if (pos==0){
            NewNode.next=head;
            return NewNode;
        }
        Node<Integer> temp=head;

        while (i<pos-1){
            temp=temp.next;

            i++;
        }
        NewNode.next=temp.next;
        temp.next=NewNode;

        return head;


    }

    public static void printR(Node<Integer> head){
        if(head==null){
            return;
        }
        printR(head.next);

        System.out.print(head.data +" ");
    }

    public static void delete(Node<Integer> head,int pos){
        int i=0;
        Node<Integer> temp=head;
        while (i<pos-1){
            temp=temp.next;
            i++;
        }
        Node<Integer>temp2=temp.next;
        temp.next=temp2.next;
        //temp.next=temp.next.next;
    }

    public static Node<Integer> revRec(Node<Integer> head){
        if (head==null || head.next==null){
            return head;
        }
        Node<Integer> NewNode=revRec(head.next);
        Node<Integer> temp=NewNode;

        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=head;
        head.next=null;
        return NewNode;
    }


    public static void main(String[] args){
//        Node<Integer> l1=new Node<>(5);
//        System.out.println(l1.data);
//        System.out.println(l1.next);
//        Node<Integer> l2=new Node<>(10);
//        l1.next=l2;
//        System.out.println(l1.next);
//        System.out.println(l2);

//        Node <Integer> l1=new Node<>(10);
//        Node <Integer> l2=new Node<>(20);
//        Node <Integer> l3=new Node<>(30);
//        l1.next=l2;
//        l2.next=l3;


        Node<Integer> head=head=input();;

        //head=insert(head,50,0);

       // delete(head,2);
        Node<Integer> newN=revRec(head);


        print(newN);




    }
}
