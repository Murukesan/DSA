import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};
        int target=4;
        BS ls=new BS();
        int start=0;
        int end= nums.length-1;
        System.out.println(ls.Binary_search(nums,target,start,end));
    }
}