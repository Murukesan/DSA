public class LS {
    public int Linear_search(int[] nums,int target){
        for(int i=0;i< nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
