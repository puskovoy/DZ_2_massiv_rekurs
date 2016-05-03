package job;

import java.util.Random;

public class Massiv_7_4 {
    private int[][] arr = new int[7][4];

    public void PrintArr() {
        Random r = new Random();
        int[] arm = new int[7];//array multiplication of numbers
        int max = 0;
        int max_i = 0;

        for (int i = 0; i < arr.length; i++) {//row 7
            for (int j = 0; j < arr[i].length; j++) {//column 4
                arr[i][j] = r.nextInt(11) - 5;//set random num range -5 to 5
                System.out.print(arr[i][j] + " ");

                if (j == 0) arm[i] = arr[i][j];//add multiplication of numbers
                else arm[i] *= arr[i][j];
            }
            System.out.println("");
            if (Math.abs(arm[i]) > max) {//get max multiplication of numbers
                max = arm[i];
                max_i = i;
            }
        }
        System.out.println("Index of max multiplication of numbers: " + max_i);
    }
}
