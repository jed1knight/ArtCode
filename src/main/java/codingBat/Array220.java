package codingBat;

/**
 * Created by Home on 30.08.2015.
 */
public class Array220 {
    public boolean array220(int[] nums, int index) {
        boolean result = false;
        if (index < nums.length - 1 && nums[index + 1] == nums[index] * 10) {
            return result = true;
        }
        else if (index < nums.length - 1) {
            result = array220(nums, index = index + 1);
        }
        return result;
    }
}
