import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        LinkedList list=new LinkedList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list);

        //Build a linked list from a scratch
        var list=new Linked_list();
        list.addLast(20);
        list.addLast(10);
        list.addLast(30);
        list.addFirst(5);
        list.show();
        System.out.println();
        list.addAt(0,25);
        list.show();
        System.out.println();
        list.removeFirst();
        list.removeLast();
        list.show();
        System.out.println();
        list.removeAt(1);
        list.show();
        System.out.println();
        System.out.println(list.contains(10));
    }
}