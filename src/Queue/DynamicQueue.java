package Queue;

public class DynamicQueue {
    private int []data;
    private int front;
    private int rear;
    private int size;
    DynamicQueue(){
        data=new int[10];
        front=-1;
        rear=-1;
        size=0;
    }
    DynamicQueue(int ele){
        data=new int[ele];
        front=-1;
        rear=-1;
        size=0;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }
    int GetFront() throws EmptyException {
        if (size()==0){
            throw new EmptyException();
        }
        return data[front];
    }
    void Enqueue(int ele){
        if (size== data.length){
            DoubleCapacity();
        }
        if (size==0){
            front=0;
        }
        rear=(rear+1)%data.length;
        data[rear]=ele;
        size++;
    }

    private void DoubleCapacity() {

        int temp[]=data;
        data=new int[2*temp.length];
        int index=0;

        for (int i=front;i< temp.length;i++){
            data[index]=temp[i];

            index++;
        }
        for (int i=0;i<front;i++){
            data[index]=temp[i];
            index++;
        }
        front=0;
        rear= temp.length-1;
    }

    int dequeue() throws EmptyException{
        if (size==0){
            throw new EmptyException();
        }
        int temp=data[front];
        front=(front+1)% data.length;

        size--;
        if (size==0){
            rear=-1;
            front=-1;
        }
        return temp;
    }

    public static void main(String[]args) throws EmptyException {
        DynamicQueue d=new DynamicQueue(3);
        d.Enqueue(200);
        d.Enqueue(1054);
        d.Enqueue(104);
        d.Enqueue(180);
        d.Enqueue(10);
        System.out.println(d.dequeue());;
        d.Enqueue(50);
        System.out.println(d.GetFront());
        System.out.println(d.size());
       // System.out.println(size);
        System.out.println(++d.size);
        System.out.println(d.size());
        d.Enqueue(60);
        System.out.println(d.size-10);



    }
}
