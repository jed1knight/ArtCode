package codingBat;

/**
 * Created by Home on 30.08.2015.
 */
public class Pairs {
    public int countPairs(String str) {
        int result = 0;
        if (str.length() > 0) {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                result = result +1 + countPairs(str = str.substring(1));
            }
            else {
                result = result + countPairs(str = str.substring(1));
            }
        }
        return result;
    }
}
