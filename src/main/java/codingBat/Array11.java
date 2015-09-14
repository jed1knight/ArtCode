package codingBat;

/**
 * Created by Home on 30.08.2015.
 */
public class Array11 {
    public int array11(int[] nums, int index) {
        int result = 0;
        if (index < nums.length && nums[index] == 11) {
            result = 1 + array11(nums, index = index + 1);
        }
        else if (index < nums.length) {
            result = array11(nums, index = index + 1);
        }
        return result;
    }
}
