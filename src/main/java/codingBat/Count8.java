package codingBat;

/**
 * Created by Home on 30.08.2015.
 */
public class Count8 {
    public int count8(int n) {
        int result = 0;
        if (n > 0 && n % 100 == 88) {
            return count8(n = n / 10) + 2;
        }
        else if (n > 0 && n % 10 == 8) {
            return count8(n = n / 10) + 1;
        }
        else if (n > 0){
            return count8(n = n / 10);
        }
        else {
            return result;
        }
    }
}
