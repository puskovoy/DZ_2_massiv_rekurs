package job;

/**
 * Created by User on 19.01.2016.
 */
public class NumHappyTickets {

    private int NumHappyTickets = 0;

    public void setNumHappyTickets() {
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;

        for (int i = 1001; i < 1000000; i++) {
            i1 = i / 100000 % 10;
            i2 = i / 10000 % 10;
            i3 = i / 1000 % 10;
            i4 = i / 100 % 10;
            i5 = i / 10 % 10;
            i6 = i % 10;
            if ((i1 + i2 + i3) == (i4 + i5 + i6)) NumHappyTickets++;
        }
    }

    public int getNumHappyTickets() {
        return NumHappyTickets;
    }
}
