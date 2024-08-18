package Queue;

public class queueUsingLL<T> {
    Node<T> front;
    Node<T> rear;
    int size;
    public queueUsingLL(){
        front=null;
        rear=null;
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    int Size(){
        return size;
    }
    T front() throws EmptyException{
        if (size==0){
            throw new EmptyException();
        }
        T ans=front.data;
        return ans;
    }
    void enQueue(T elem){
        Node<T> nd=new Node<T>(elem);
        if (size==0){
            front=nd;
            rear=nd;
            size++;
        }
        else {
            rear.next=nd;
            rear=nd;
            size++;
        }

    }
    T dequeue() throws EmptyException {
        if (size==0){
            throw new EmptyException();
        }
        T temp=front.data;
        front=front.next;
        if (size==1) {
            rear=null;

        }
        size--;


        return temp;
    }
    public static void main(String[] args) throws EmptyException{
        queueUsingLL<Integer> d=new queueUsingLL<>();
        System.out.println(d.isEmpty());
        d.enQueue(15);
        d.enQueue(205);
        d.enQueue(205);
        d.enQueue(205);
        System.out.println(d.front());
        System.out.println(d.Size());
        System.out.println(d.dequeue());
        System.out.println(d.Size());
        System.out.println(d.isEmpty());


    }

}
