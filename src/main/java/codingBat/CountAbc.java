package codingBat;

/**
 * Created by Home on 30.08.2015.
 */
public class CountAbc {
    public static void main(String[] args) {
        CountAbc abc = new CountAbc();
        int a = abc.countAbc("aaabc");
        System.out.println(a);
    }
    public int countAbc(String str) {
        int result = 0;
        while (str.length() > 2) {
            if (str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba")) {
                result = 1 + countAbc(str = str.substring(1));
            }
            else {
                result = countAbc(str = str.substring(1));
            }
        }
        return result;
    }
}
