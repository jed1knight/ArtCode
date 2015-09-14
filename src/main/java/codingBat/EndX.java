package codingBat;

/**
 * Created by Home on 30.08.2015.
 */
public class EndX {
    public String endX(String str) {
        String result = new String();
        if (str == "") {
            return result;
        }
        result = result + str.charAt(0);
        if (str.length() > 1) {

            if (str.charAt(0) == 'x') {
                result = endX(str = str.substring(1)) + 'x';
                //TODO 'x' поменять на str.charAt(0)
            }
            else {
                result = str.charAt(0) + endX(str = str.substring(1));
            }
        }
        return result;
    }
}
