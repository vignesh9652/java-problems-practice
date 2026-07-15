import java.util.HashSet;

public class ContainsDuplicate {
    static void main(String[] args) {
        int[] nums={1,3,2,1} ;
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }
    static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set= new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (set.contains(element)){
                return true;
            }
            set.add(element);
        }
        return false;
    }
}
