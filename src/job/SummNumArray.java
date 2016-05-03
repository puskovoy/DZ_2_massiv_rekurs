package job;

public class SummNumArray {

    public void getSumAllEllArr(int k) {
        NewArray newArray = new NewArray();
        int[] arr = newArray.getArr(10, 20, 0);
        int sumElArr = 0;

        for (int anArr : arr) {
            if (anArr == k) sumElArr += anArr;
        }
        System.out.println("The summ of element array equals number " + k + ": " + sumElArr);
    }
}
