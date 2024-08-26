import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Util Package inbuilt methods
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.capacity());
        System.out.println(s.reversed());
        System.out.println(s.firstElement());
        System.out.println(s.getFirst()+" "+s.getLast());
        System.out.println(s.pop());

        //create a own stack
        System.out.println("---- Stack Creation ----");
        stack s1=new stack(5);
        s1.pop();
        System.out.println(s1.peek());
        System.out.println(s1.size());
        System.out.println(s1.isEmpty());
        s1.push(5);
        s1.push(10);
        s1.pop();
        System.out.println();
        System.out.println(s1.peek());
        System.out.println(s1.size());
        System.out.println(s1.isEmpty());
    }
}