package codingBat;

/**
 * Created by Home on 30.08.2015.
 */
public class AllStar {
    public String allStar(String str) {
        String result = new String();
        if (str == "") {
            return "";
        }
        result = result + str.charAt(0);
        if (str.length() > 1) {
            result = result + '*' + allStar(str.substring(1));
        }
        return result;
    }
}
