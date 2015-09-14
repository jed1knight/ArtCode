package codingBat;

/**
 * Created by Home on 30.08.2015.
 */
public class NoX {
    public String noX(String str) {
        String result = new String();
        if (str.length() > 0 && str.charAt(0) == 'x') {
            return noX(str.substring(1));
        }
        else if (str.length() > 0) {
            return str.charAt(0) + noX(str.substring(1));
        }
        return result;
    }
}
