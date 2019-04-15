import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSum {

    public static void main(String [] args) {
        int [] testArray = {11,15,2,7};
        int [] testArray1 = {3,2,3};
        System.out.println(Arrays.toString(twoSumBest(testArray1, 6)));
    }

    public static int[] twoSumBest(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

