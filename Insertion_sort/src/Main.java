//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] arr={9,8,5,4,1};
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int key=arr[i];
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}