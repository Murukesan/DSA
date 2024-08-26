//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int count=0,candidate=-1;

        for(int index=0;index<arr.length;index++){
            System.out.println(candidate);
            System.out.println(count);
            if(count==0){
                candidate=arr[index];
                count=1;
            }
            else{
                if(arr[index]==candidate){
                    count++;
                }
                else {
                    count--;
                }
            }
        }
        System.out.println(count);
        System.out.println(candidate);
        count=0;
        for(int index=0;index<arr.length;index++){
            if(arr[index]==candidate){
                count++;
            }
        }
        if(count>arr.length/2)
            System.out.println(candidate);

    }
}