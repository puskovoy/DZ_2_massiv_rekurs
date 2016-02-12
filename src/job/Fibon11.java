package job;

/**
 * Created by User on 19.01.2016.
 *print the number of sequences Fibonachi
 */
public class Fibon11 {

    public void PrintFibonachi(int NumFibon) {
        int a = 1;
        int b = 1;
        int fib = 2;
        int i = 2;

        System.out.print(a + " " + b);//print 1 and 2 num

        while (i < NumFibon) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);//print the rest of the num
            i++;
        }
    }
}
