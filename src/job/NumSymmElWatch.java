package job;

/**
 * Created by User on 19.01.2016.
 */
public class NumSymmElWatch {

    private int NumSymElWatch = 0;

    public void setNumSymElWatch() {
//find count of symmetric combination
        for (int i1 = 0; i1 < 24; i1++) {
            int a = i1 % 10;
            int b = (i1 / 10) % 10;
            for (int i2 = 0; i2 < 60; i2++) {
                int c = i2 % 10;
                int d = (i2 / 10) % 10;
                if (a == d & b == c) NumSymElWatch += 1;
            }
        }
    }

    public int getNumSymElWatch() {
        return NumSymElWatch;
    }
}




