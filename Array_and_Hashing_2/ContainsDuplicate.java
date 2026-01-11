package Array_and_Hashing_2;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        for (int num : nums){
            if (seenNumbers.contains(num))
                return true;
            else seenNumbers.add(num);
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 1 };
        ContainsDuplicate solution = new ContainsDuplicate();
        System.out.println(solution.containsDuplicate(nums));
    }
}
