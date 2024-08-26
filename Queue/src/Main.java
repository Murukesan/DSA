//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        queue q=new queue();
        q.dequeue();
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);
        q.enqueue(30);
        q.show();
        q.enqueue(40);
        q.show();
        q.dequeue();
        q.show();
    }
}