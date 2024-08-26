import java.util.Queue;

public class queue {
    int [] Queue=new int [5];
    int size;
    int front;
    int rear;

    public void enqueue(int data){
        if(!isFull()){
            Queue[rear]=data;
            rear=(rear+1)%5;
            size++;
        }
        else {
            System.out.println("Queue is FULL");
        }

    }
    public int dequeue(){
        int data=0;
        if(!isEmpty()){
            data=Queue[front];
            front=(front+1)%5;
            size--;
            return data;
        }
        else {
            System.out.println("Queue is Empty");
            return data;
        }

    }
    public void show(){
        System.out.print("Elements : ");
        for(int i=0;i<q_size();i++){
            System.out.print(Queue[(front+i)%5]+" ");
        }
        System.out.println();
    }
    public int q_size(){
        return size;
    }

    public boolean isFull(){
        return q_size()==5;
    }
    public boolean isEmpty(){
        return q_size()==0;
    }
}
