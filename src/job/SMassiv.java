package job;

import java.util.Random;

/**
 * Created by User on 22.01.2016.
 */
public class SMassiv {
    private int[][] SMass = new int[8][5];

    public void printSMass() {
        Random r = new Random();
        for (int i = 0; i < SMass.length; i++) {//row 8
            for (int j = 0; j < SMass[i].length; j++) {//column 5
                SMass[i][j] = 10 + r.nextInt(99 - 10 + 1);//set random num range 10 to 99
                System.out.print(SMass[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
