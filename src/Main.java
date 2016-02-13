import job.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//1. Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его
// цифр (заранее не известно сколько цифр будет в числе).

        /*Scanner vod = new Scanner(System.in);
        SumOlNum test = new SumOlNum();
        System.out.println("Please enter a natural number: ");
//pass values from console
        test.setResult(vod.nextLine());
//print result
        System.out.println("Result is: " + test.getResult());*/

//2. Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
// первый и второй члены последовательности равны единицам, а каждый следующий — сумме
// двух предыдущих.

        /*Fibon11 test = new Fibon11();
//print the number of sequences Fibonachi
        test.PrintFibonachi(11);*/

//3. В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую
// неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от
// 000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр
// номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или
// 567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета
// и теперь раздумывает, как много сувениров потребуется. С помощью программы подсчитайте
// сколько счастливых билетов в одном рулоне?

       /* NumHappyTickets test = new NumHappyTickets();
//to calculate the number of lucky tickets
        test.setNumHappyTickets();
//print the count of lucky tickets
        System.out.println("The count of lucky tickets: " + test.getNumHappyTickets());*/

//4. Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за
// сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
// что справа от двоеточия (например, 02:20, 11:11 или 15:51).

        /*NumSymmElWatch test = new NumSymmElWatch();
        test.setNumSymElWatch();
        System.out.println("The count of symmetric combination: " + test.getNumSymElWatch());*/

//5. Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из
// отрезка [10;99]. Вывести массив на экран.

        /*SMassiv test = new SMassiv();
        test.printSMass();*/

//6. Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из
// отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс строки с
// наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести
// индекс первой встретившейся из них.

        /*Massiv_7_4 test = new Massiv_7_4();
        test.PrintArr();*/

//7. Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму
// чисел от 1 до n;

        /*Summ_N test = new Summ_N();
        Scanner vod = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        System.out.println("The sum number is: " + test.Summ(vod.nextInt()));*/

//8. Подсчитайте, сколько раз потребуется повторно вычислить четвёртый элемент
// последовательности Фибоначчи для вычисления пятнадцатого элемента.

       /* NumFibon test1 = new NumFibon();
        NumFibon test2 = new NumFibon();
        test1.getNumFibon(15);
        test2.getNumFibon(4);
        System.out.println("To calculate Fibonacci fifteenth element need " + test1.getCount() / test2.getCount() + " timse to calculate a fourth element. ");*/

//9. Создайте код, который выводит все простые числа из интервала от 2 до n (заданного с
// клавиатуры). Результат должен быть: 2,3,5,7 ...

        /*Scanner vod = new Scanner(System.in);
        System.out.println("Please enter the number in the range from 2 to n: ");
        int a = vod.nextInt();
        SimpleNum test = new SimpleNum(a);
        test.printSimpleNum(a);//print array*/

//10. Имеется три стержня, на один из которых нанизаны N колец, причем кольца отличаются
// размером и лежат меньшее на большем. Требуется перенести пирамиду из N колец с одного
// стержня на другой за наименьшее число ходов. За один раз разрешается переносить только
// одно кольцо, причём нельзя класть большее кольцо на меньшее.

        /*Hanoi test = new Hanoi();
        Scanner vod = new Scanner(System.in);
        System.out.println("Please enter the number of rings: ");
        test.MoveHanoi(vod.nextInt(), 1, 3, 2);
        System.out.println("Min need to move " + test.getMoves() + " times.");*/
    }
}
