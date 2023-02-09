import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int i=0;
        for(i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                break;
            }else{
                hm.put(nums[i],i);
            }
        }
        return new int[]{hm.get(target-nums[i]),i};
    }

    public static void main(String[] args){
       new TwoSum().twoSum(new int[]{2,7,11,15},9);
    }

}
