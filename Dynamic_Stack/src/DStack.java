public class DStack {
    int top=0;
    int s_size=2;
    int[] s_arr=new int[s_size];
    public void push(int data){
        if(size()==s_size){
            expand();
        }
        s_arr[top]=data;
        top++;
    }

    private void expand() {
        int[] expanded_arr=new int[s_size*2];
        System.arraycopy(s_arr,0,expanded_arr,0,size());
        s_arr=expanded_arr;
        s_size*=2;
    }

    public void print(){
        for(int num:s_arr){
            System.out.print(num+ " ");
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
            shrink();
        }

    }

    private void shrink() {
        int length=size();
        if(length<=(s_size/2)/2){
            s_size/=2;
            int [] newStack=new int[s_size];
            System.arraycopy(s_arr,0,newStack,0,s_size);
            s_arr=newStack;
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
