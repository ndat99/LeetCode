package Array_and_Hashing_2;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if ((nums[i] + nums[j]) == target){
                    sum[0] = i;
                    sum[1] = j;
                    break;
                }
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] result = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
