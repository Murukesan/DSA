//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] nums={2,9,3,8,4,7};
        int size=nums.length;
        int temp=0;
        int minIndex=-1;
        System.out.println("Before Sorting");
        for (int num:nums){
            System.out.print(num+" ");
        }

        for(int i=0;i<size-1;i++){
            minIndex=i;
            for(int j=i;j<size;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex=j;
                }
            }
            temp=nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;

            System.out.println();
            System.out.println("After Sorting");
            for (int num:nums){
                System.out.print(num+" ");
            }

        }
        System.out.println();
        System.out.println("After Sorting");
        for (int num:nums){
            System.out.print(num+" ");
        }
    }
}