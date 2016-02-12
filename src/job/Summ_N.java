package job;

/**
 * Created by User on 22.01.2016.
 */
public class Summ_N {
//the method find sum number 1 to n
public int Summ(int n) {
        int res;

        if (n == 1) return 1;
        res = Summ(n - 1) + n;
        return res;
    }
}
