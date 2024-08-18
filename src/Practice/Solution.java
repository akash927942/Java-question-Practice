package Practice;

import java.util.List;

public class Solution {
    public int singleNumber(List<Integer> nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> nums = List.of(4, 1, 2, 1, 2);
        System.out.println("The single number is: " + solution.singleNumber(nums));  // Output: 4
    }
}

