package Array_and_Hashing;
import java.util.HashSet;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers =  new HashSet<>();

        for (int num : nums){
            if (seenNumbers.contains(num)){
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }
    public static void main(String args[]) {
        ContainsDuplicate solution = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums));
    }
}
