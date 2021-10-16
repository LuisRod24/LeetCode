package leetcode;

import org.testng.annotations.Test;

public class TwoSum {

    @Test
    public int[] twoSum(int[] nums, int target) {

        nums = new int[]{2, 7, 11, 15};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

