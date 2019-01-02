import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int i = 0;
        for (int num : nums) {
            numMap.put(num, i);
            i++;
        }

        i = 0;
        for (int num: nums) {
            if(numMap.containsKey(target - num) &&
                    i != numMap.get(target-num)) {
                return new int[]{i, numMap.get(target-num)};
            }
            i++;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{3, 2, 4}, 6));
    }
}
