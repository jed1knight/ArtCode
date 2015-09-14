package codingBat;

/**
 * Created by Home on 30.08.2015.
 */
public class Fibonacci {
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        int prev = 0;
        int result = 1;
        result = result + prev;
        if (n > 2) {
            result = fibonacci(n = n - 1) + fibonacci(n = n - 1);

        }

        return result;
    }
}
