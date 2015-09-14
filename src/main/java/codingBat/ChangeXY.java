package codingBat;

/**
 * Created by Home on 30.08.2015.
 */
public class ChangeXY {
    public String changeXY(String str) {
        String result = new String();
        if (str.length() > 0 && str.charAt(0) == 'x') {
            return result +'y' + changeXY(str.substring(1));
        }
        else if (str.length() > 0) {
            return result + str.charAt(0) + changeXY(str.substring(1));
        }
        return result;
    }
}
