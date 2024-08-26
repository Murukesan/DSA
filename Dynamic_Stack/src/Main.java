//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DStack ds=new DStack();
        ds.push(1);
        ds.push(2);
        ds.print();
        System.out.println();
        ds.push(3);
        ds.print();
        System.out.println();
        ds.pop();
        ds.print();
        System.out.println();
        ds.pop();
        ds.print();
        System.out.println();
    }
}