public class Merge_solving {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int [] nums=new int[m+n];
        int k=0;
        while(i<m || j<n){
            if(nums1[i]<=nums2[j]){
                nums[k]=nums1[i];
                i++;
            }
            else{
                nums[k]=nums2[j];
                j++;
            }
            k++;
        }
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
