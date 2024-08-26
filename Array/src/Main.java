import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args){
    int[] numbers=new int[3];
    numbers[0]=1;
    numbers[1]=2;
    numbers[2]=3;
    System.out.println(numbers.length);
    System.out.println(Arrays.toString(numbers));

    //Dynamic Array
    D_Array num=new D_Array(3);
    num.insert(10);
    num.insert(20);
    num.insert(30);
    num.insert(30);
    num.print();
    num.removeAt(3);
    System.out.println(num.indexOf(10));
    num.print();

    //Arraylist

    ArrayList<Integer> AL=new ArrayList<Integer>();
    AL.add(10);
    AL.add(20);
    AL.add(30);
    System.out.println(AL);

  }

}