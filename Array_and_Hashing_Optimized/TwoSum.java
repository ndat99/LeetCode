package Array_and_Hashing;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int addedNumber = target - nums[i];
            if (map.containsKey(addedNumber)){
                return new int[] {map.get(addedNumber), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String args[]) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] result = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
