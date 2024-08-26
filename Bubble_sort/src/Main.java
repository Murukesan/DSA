//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] nums={2,9,3,8,4,7};
        int size=nums.length;
        int temp=0;
        System.out.println("Before Sorting");
        for (int num:nums){
            System.out.print(num+" ");
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(nums[j]>nums[j+1]) {
                    temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
            System.out.println();
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