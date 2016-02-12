package job;

/**
 * Created by User on 24.01.2016.
 */
public class SimpleNum {
    private int[] mas;//array simple numbers
    private int m = 0;//counter

    public SimpleNum(int n) {
        mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i;
        }
        mas[1] = 0; // "1" is not a simple, add "0"
        for (int s = 2; s < n; s++) {//the sieve of Eratosthenes
            if (mas[s] != 0) {
                for (int w = s * 2; w < n; w += s) {
                    mas[w] = 0;//if num not a simple, add "0"
                }
            }
        }
    }

    public void printSimpleNum(int maxNum) {
        if (maxNum == 0) {
            m = 0;
            return;//stop recurs
        }
        if (mas[m] != 0) System.out.print(mas[m] + " ");//print array
        m++;
        printSimpleNum(maxNum - 1);
    }
}
