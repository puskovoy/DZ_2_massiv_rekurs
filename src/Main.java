import job.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//1. ��� ��������� ������������� � ���������� ������������ ����� ���������� ����� ���� ���
// ���� (������� �� �������� ������� ���� ����� � �����).

        /*Scanner vod = new Scanner(System.in);
        SumOlNum test = new SumOlNum();
        System.out.println("Please enter a natural number: ");
//pass values from console
        test.setResult(vod.nextLine());
//print result
        System.out.println("Result is: " + test.getResult());*/

//2. �������� �� ����� ������ 11 ������ ������������������ ���������. ����������, ���
// ������ � ������ ����� ������������������ ����� ��������, � ������ ��������� � �����
// ���� ����������.

        /*Fibon11 test = new Fibon11();
//print the number of sequences Fibonachi
        test.PrintFibonachi(11);*/

//3. � ������ N ������ � ������� �������������� �� �������� �������� �������. ������
// ������ ���������� ���� ���������� � ������� ���������� ����� ������� � �������� ��
// 000001 �� 999999. ����������� ��������� ������� � �������� ����� ������ ��� ����
// ������ ����� ����� ��������� ��� ����, ���, ��������, � ������� � �������� 003102 ���
// 567576. ���������� ���� ������ �������� ������� ���������� ������� ����������� ������
// � ������ �����������, ��� ����� ��������� �����������. � ������� ��������� �����������
// ������� ���������� ������� � ����� ������?

       /* NumHappyTickets test = new NumHappyTickets();
//to calculate the number of lucky tickets
        test.setNumHappyTickets();
//print the count of lucky tickets
        System.out.println("The count of lucky tickets: " + test.getNumHappyTickets());*/

//4. ����������� ���� ���������� ����� � ������� �� 00:00 �� 23:59. ���������� ������� ��� ��
// ����� ��������� ���, ��� ����� �� ��������� ������������ ������������ ���������� ��� ���,
// ��� ������ �� ��������� (��������, 02:20, 11:11 ��� 15:51).

        /*NumSymmElWatch test = new NumSymmElWatch();
        test.setNumSymElWatch();
        System.out.println("The count of symmetric combination: " + test.getNumSymElWatch());*/

//5. ������� ��������� ������ �� 8 ����� �� 5 �������� � ������ �� ��������� ����� ����� ��
// ������� [10;99]. ������� ������ �� �����.

        /*SMassiv test = new SMassiv();
        test.printSMass();*/

//6. C������ ��������� ������ �� 7 ����� �� 4 ������� � ������ �� ��������� ����� ����� ��
// ������� [-5;5]. ������� ������ �� �����. ���������� � ������� �� ����� ������ ������ �
// ���������� �� ������ ������������� ���������. ���� ����� ����� ���������, �� �������
// ������ ������ ������������� �� ���.

        /*Massiv_7_4 test = new Massiv_7_4();
        test.PrintArr();*/

//7. �������� �����, ������� ��� ������� ����� n (��������� � ����������) ��������� �����
// ����� �� 1 �� n;

        /*Summ_N test = new Summ_N();
        Scanner vod = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        System.out.println("The sum number is: " + test.Summ(vod.nextInt()));*/

//8. �����������, ������� ��� ����������� �������� ��������� �������� �������
// ������������������ ��������� ��� ���������� ������������ ��������.

       /* NumFibon test1 = new NumFibon();
        NumFibon test2 = new NumFibon();
        test1.getNumFibon(15);
        test2.getNumFibon(4);
        System.out.println("To calculate Fibonacci fifteenth element need " + test1.getCount() / test2.getCount() + " timse to calculate a fourth element. ");*/

//9. �������� ���, ������� ������� ��� ������� ����� �� ��������� �� 2 �� n (��������� �
// ����������). ��������� ������ ����: 2,3,5,7 ...

        /*Scanner vod = new Scanner(System.in);
        System.out.println("Please enter the number in the range from 2 to n: ");
        int a = vod.nextInt();
        SimpleNum test = new SimpleNum(a);
        test.printSimpleNum(a);//print array*/

//10. ������� ��� �������, �� ���� �� ������� �������� N �����, ������ ������ ����������
// �������� � ����� ������� �� �������. ��������� ��������� �������� �� N ����� � ������
// ������� �� ������ �� ���������� ����� �����. �� ���� ��� ����������� ���������� ������
// ���� ������, ������ ������ ������ ������� ������ �� �������.

        /*Hanoi test = new Hanoi();
        Scanner vod = new Scanner(System.in);
        System.out.println("Please enter the number of rings: ");
        test.MoveHanoi(vod.nextInt(), 1, 3, 2);
        System.out.println("Min need to move " + test.getMoves() + " times.");*/
    }
}
