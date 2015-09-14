package codingBat;

/**
 * Created by Home on 30.08.2015.
 */
public class ChangePi {
    public String changePi(String str) {
        String result = new String();
        if (str.length() > 1 && str.charAt(0) == 'p' && str.charAt(1) == 'i') {
            return str = "3.14" + changePi(str.substring(2));
        }
        else if (str.length() > 0) {
            return str = str.charAt(0) + changePi(str.substring(1));
        }
        return result;
    }
}
