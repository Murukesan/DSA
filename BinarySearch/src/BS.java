public class BS {
    public int Binary_search(int[] nums,int target, int start, int end){
//        int start=0;
//        int end= nums.length-1;
//        while (start<=end){
//            int mid=(start+end)/2;
//            if(nums[mid]==target){
//                return mid;
//            }
//            else if (nums[mid]<target) {
//
//                start=mid+1;
//                continue;
//            }
//            else  {
//                end=mid-1;
//                continue;
//            }
//        }
//        return -1;

        // Recursive Method
        int mid=(start+end)/2;
        if(nums[mid]==target){
                return mid;
        }
        else if (nums[mid]<target) {
            return Binary_search(nums,target,mid+1,end);
        }
            else  {
            return Binary_search(nums,target,start,mid-1);
            }

    }
}
