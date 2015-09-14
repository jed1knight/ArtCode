package codingBat;

/**
 * Created by Home on 30.08.2015.
 */
public class Array6 {
    public boolean array6(int[] nums, int index) {
        boolean result = false;
        if (index < nums.length && nums[index] == 6) {
            index = nums.length;
            return result = true;
        }
        else if (index < nums.length) {
            return array6(nums, index = index + 1);
        }
        return result;
    }
}
