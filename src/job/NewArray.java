package job;

import java.util.Random;

class NewArray {

    int[] getArr(int numElementArray, int maxRandomElem, int minRandomElem) {
        int[] arr = new int[numElementArray];
        Random r = new Random();

        System.out.print("The array is: [");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(maxRandomElem) - minRandomElem;
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        return arr;
    }
}
