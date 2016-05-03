package job;


import java.util.ArrayList;
import java.util.List;

public class ArrayZeroElement {

    public void getZeroElemen() {
        NewArray newArray = new NewArray();
        int[] arr = newArray.getArr(10, 11, 5);
        List<Integer> zeroElem = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) zeroElem.add(i);
        }
        System.out.println("The number of zero element: " + zeroElem);
    }
}
