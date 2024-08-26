//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static void mergesort(int[] nums, int l, int r) {
        if(l<r){
            int mid=(l+r)/2;
            mergesort(nums,l,mid);
            mergesort(nums,mid+1,r);
            merge(nums,l,mid,r);
        }
    }

    private static void merge(int[] nums, int l, int mid, int r) {
        int n1=mid-l+1;
        int n2=r-mid;
        int[] lArr=new int[n1];
        int[] rArr=new int[n2];

        for(int i=0;i<n1;i++){
            lArr[i]=nums[l+i];
        }
        for(int j=0;j<n2;j++){
            rArr[j]=nums[mid+1+j];
        }
        //Debug
        System.out.println();
        for(int num:nums){
            System.out.print(num+" ");
        }
        int i=0;
        int j=0;
        int k=l;
         while(i<n1 && j<n2){
             if(lArr[i]<=rArr[j]){
                 nums[k]=lArr[i];
//System.out.println(nums[k]);
                 i++;
             }
             else{
               //  System.out.println(nums[k]);
                 nums[k]=rArr[j];
                 j++;
             }
             k++;
         }

    }

    public static void main(String[] args) {
        int [] nums={6,5,4,3,2};
        System.out.println("Before sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();

        mergesort(nums,0,nums.length-1);

        System.out.println("After sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }


}