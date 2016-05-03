import job.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice;
        Scanner vod = new Scanner(System.in);

        for (; ; ) {
            do {
                System.out.println("Choose nom home work:");
                System.out.println(" 1 Sum oll numbers.");
                System.out.println(" 2 The first 11 members of the Fibonacci sequence.");
                System.out.println(" 3 Lucky ticket.");
                System.out.println(" 4 The electronic watches, symmetrical combination.");
                System.out.println(" 5 Two-dimensional array of 8 rows by 5 columns.");
                System.out.println(" 6 Two-dimensional array of 7 rows by 4 columns.");
                System.out.println(" 7 Method calculates the sum of the numbers from 1 to n.");
                System.out.println(" 8 Recalculate the fourth element of the Fibonacci sequence to calculate the fifteenth element.");
                System.out.println(" 9 All prime numbers in the interval from 2 to n.");
                System.out.println(" 10 The Hanoi pyramid.");
                System.out.println(" 11 List.");
                System.out.println(" 12 SummNumArray.");
                System.out.println(" 13 ArrayZeroElement.");
                System.out.println(" 14 PositivNgativNumbers.");
                System.out.println(" 15 Increasing Sequence.");
                System.out.println(" 0 - exit ");
                choice = vod.nextInt();
            } while (choice < 0 | choice > 52);

            if (choice == 0) {
                System.out.println("Bye -_-");
                break;
            }

            switch (choice) {
                case 1:
                    SumOlNum test1 = new SumOlNum();
                    System.out.println("Please enter a natural number: ");
//pass values from console
                    test1.setResult(vod.nextLine());
//print result
                    System.out.println("Result is: " + test1.getResult());
                    break;
                case 2:
                    Fibon11 test2 = new Fibon11();
//print the number of sequences Fibonachi
                    test2.PrintFibonachi(11);
                    break;
                case 3:
                    NumHappyTickets test3 = new NumHappyTickets();
//to calculate the number of lucky tickets
                    test3.setNumHappyTickets();
//print the count of lucky tickets
                    System.out.println("The count of lucky tickets: " + test3.getNumHappyTickets());
                    break;
                case 4:
                    NumSymmElWatch test4 = new NumSymmElWatch();
                    test4.setNumSymElWatch();
                    System.out.println("The count of symmetric combination: " + test4.getNumSymElWatch());
                    break;
                case 5:
                    SMassiv test5 = new SMassiv();
                    test5.printSMass();
                    break;
                case 6:
                    Massiv_7_4 test6 = new Massiv_7_4();
                    test6.PrintArr();
                    break;
                case 7:
                    Summ_N test7 = new Summ_N();
                    System.out.println("Please enter a number: ");
                    System.out.println("The sum number is: " + test7.Summ(vod.nextInt()));
                    break;
                case 8:
                    NumFibon test8 = new NumFibon();
                    System.out.println("Need to calculate " + test8.getNumFibon(15) / test8.getNumFibon(4) + " timse.");
                    break;
                case 9:
                    System.out.println("Please enter the number in the range from 2 to n: ");
                    int a = vod.nextInt();
                    SimpleNum test9 = new SimpleNum(a);
                    test9.printSimpleNum(a);//print array
                    break;
                case 10:
                    Hanoi test10 = new Hanoi();
                    System.out.println("Please enter the number of rings: ");
                    test10.MoveHanoi(vod.nextInt(), 1, 3, 2);
                    System.out.println("Min need to move " + test10.getMoves() + " times.");
                    break;
                case 11:
                    WorkWithCollection test11 = new WorkWithCollection();
                    System.out.println("Collections LinkedList " + test11.getSorted());
                    System.out.println("Collections ArrayList " + test11.getSortedArrayList());
                    System.out.println("Collections HashMap " + test11.getSortedMap());
                    System.out.println("Collections LinkedHashMap " + test11.getSortedLinkedHashMap());
                    System.out.println("Collections HashSet " + test11.getSortedSet());
                    System.out.println("Collections LinkedHashSet " + test11.getSortedLinkedHashSet());
                    break;
                case 12:
                    System.out.println("Please enter the number: ");
                    int k = vod.nextInt();
                    SummNumArray test12 = new SummNumArray();
                    test12.getSumAllEllArr(k);
                    break;
                case 13:
                    ArrayZeroElement test13 = new ArrayZeroElement();
                    test13.getZeroElemen();
                    break;
                case 14:
                    PositivNgativNumbers test14 = new PositivNgativNumbers();
                    test14.getNumPositNegat();
                    break;
                case 15:
                    IncreasingSequence test15 = new IncreasingSequence();
                    System.out.println("The sequence is increasing: " + test15.isIncreasingSequence());
                    break;

            }
            System.out.println();
        }
    }
}
