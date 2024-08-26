//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums={2,1,3,4};
        quicksort(nums,0,nums.length-1);
        for(int num:nums){
            System.out.println(num+" ");
        }

    }

    public static void quicksort(int[] nums, int low, int high) {
        if (low<high){
            int pivot=partition(nums,low,high);
            quicksort(nums,0,pivot-1);
            quicksort(nums,pivot+1,high);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot=nums[high];
        int i=low-1;
        int temp=0;
        for(int j=low;j<high;j++){
            if (nums[j]<pivot){
                i++;
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
        temp=nums[high];
        nums[high]=nums[i+1];
        nums[i+1]=temp;
        return i+1;
    }
}