package codingBat;

/**
 * Created by Home on 30.08.2015.
 */
public class PowerN {
    public int powerN(int base, int n) {
        int result = base;
        if (n > 1) {
            return result = powerN(base, n - 1) * base;
        }
        return result;
    }
}
