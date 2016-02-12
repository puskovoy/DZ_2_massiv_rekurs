package job;

/**
 * Created by User on 23.01.2016.
 */
public class NumFibon {

    public int getNumFibon(int Num) {
        if (Num == 1) return 1;
        if (Num == 2) return 1;
        return getNumFibon(Num - 1) + getNumFibon(Num - 2);
    }
}
