import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static void main(String[] args) {
        int[] nums = {2,7,5,11};
        int target = 9;
        int[] ans = twoSums(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSums(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int needed = target - current;
            if(map.containsKey(needed)){
                return new int[] {map.get(needed),i};
            }
            map.put(current,i);
        }
        return new int[] {-1,-1};
    }
}
