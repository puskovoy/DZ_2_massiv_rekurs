package job;

/**
 * Created by User on 23.01.2016.
 */
public class NumFibon {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public int getNumFibon(int Num) {
        count++;
        if (Num == 1) return 1;
        if (Num == 2) return 1;
        return getNumFibon(Num - 1) + getNumFibon(Num - 2);
    }
}
