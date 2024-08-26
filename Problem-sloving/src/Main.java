import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "0P";
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)){
                sb.append(c);
            }
        }
        String filtered_string=sb.toString().toLowerCase();
        String reversed_string= String.valueOf(sb.reverse()).toLowerCase();
        System.out.println();
        if(filtered_string.equals(reversed_string)){
            System.out.println("Palidrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

        //Problem 2

        int [] nums={0,0,1,1,1,2,2,3,3,4};
        ArrayList<Integer> res=new ArrayList<Integer>();
        for (int i=0;i< nums.length;i++){
            if(!res.contains(nums[i])){
                res.add(nums[i]);
            }
        }
        for(int i=0;i<res.size();i++){
            nums[i]=  res.get(i);
        }
        System.out.println(nums[1]);
        Merge_solving ms=new Merge_solving();
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3;
        int n=3;
        ms.merge(nums1, m,nums2,n);
    }
}