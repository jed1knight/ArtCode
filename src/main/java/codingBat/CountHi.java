package codingBat;

/**
 * Created by Home on 30.08.2015.
 */
public class CountHi {
    public int countHi(String str) {
        int result = 0;
        if (str.length() > 1 && str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            return result = countHi(str.substring(1)) + 1;
        }
        else if (str.length() > 1) {
            return result = countHi(str.substring(1));
        }
        return result;
    }
}
