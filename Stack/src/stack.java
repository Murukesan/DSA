import java.util.ArrayList;

public class stack {
    int[] s_arr;
    int top=0;
    int s_size=0;
    public stack(int size){
        s_size=size;
        s_arr=new int[size];
    }

    public stack() {

    }


    public void print(){
        for(int num:s_arr){
            System.out.print(num+ " ");
        }

    }
    public void push(int data){
        if(top==s_size){
            System.out.println("Stack is full");
        }
        else{
            s_arr[top]=data;
            top++;
            System.out.println(s_arr[top--]);
            print();
        }

    }
    public void pop(){
        if(top==0){
            System.out.println("Stack is Empty");
        }
        else{
            top--;
            int element=s_arr[top];
            s_arr[top]= 0;
            System.out.println();

            print();
        }

    }
    public int peek(){
        int data=0;
        if(top==0){
            System.out.println("Stack is empty");
            return data;
        }
        else{
            return s_arr[top-1];
        }
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top<=0;
    }
}
