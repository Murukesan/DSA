import java.util.NoSuchElementException;

public class Linked_list {


    public class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node first;
    private Node last;
     public void addLast(int item){
         //if LL is null, head and tail =item
         var node=new Node(item);
         if(isEmpty()){
             first=last=node;
         }
         else{
             last.next=node;
             System.out.println(last.data);
             last=node;
             System.out.println(last.data);

         }
     }
    public void addFirst(int item){
        //if LL is null, head and tail =item
        var node=new Node(item);
        if(isEmpty()){
            first=last=node;
        }
        else{
            node.next=first;
            first=node;

        }
    }
    public void addAt(int index,int data){
         if(index==0){
             addFirst(data);
         }
         else{
             Node node=new Node(data);
             Node n=first;
             for(int i=0;i<index-1;i++){
                 n=n.next;
             }
             node.next=n.next;
             n.next=node;
         }
    }
    public void removeAt(int index) {
        if(index==0){
            first=first.next;
        }
        else{
            Node n=first;
            Node n1=null;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;

        }
    }
    public void show(){
        Node n=first;
        while(n.next!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.print(n.data+" ");
    }
    public int indexOf(int item){
         int index=0;
         Node current=first;
         while (current!=null){
             if(current.data==item) return index;
             else {
                 current=current.next;
                 index++;
             }
         }
         return -1;
    }
    public boolean contains(int item){
         return indexOf(item)!=-1;
    }
    public void removeFirst(){
         if(first==null){
             throw new NoSuchElementException();
         }
         else{
             if(first==last){
                 first=last=null;
                 return;
             }
             var second=first.next;
             first.next=null;
             first=second;
         }
    }
    public void removeLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first==last){
            first=last=null;
            return;
        }
         //[10,20,30]
         var prevoius=Previous(last);
         last=prevoius;
         last.next=null;
    }
    public Node Previous(Node node){

        var current=first;
        while (current.next!=null){
            if (current.next==node) return current;
            current=current.next;
        }
        return null;
     }
    private boolean isEmpty(){
         return first==null;
    }
}
