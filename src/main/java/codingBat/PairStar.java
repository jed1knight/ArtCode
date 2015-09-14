package codingBat;

/**
 * Created by Home on 30.08.2015.
 */
public class PairStar {
    public String pairStar(String str) {
        String result = new String();
        if (str.length() > 1 && str.charAt(0) == str.charAt(1)) {
            result = result + str.charAt(0) + '*' + pairStar(str.substring(1));
        }
        else if (str.length() > 0) {
            result = result + str.charAt(0) + pairStar(str.substring(1));
        }
        return result;
    }
}
