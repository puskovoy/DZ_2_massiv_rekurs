package job;

public class IncreasingSequence {

    public boolean isIncreasingSequence() {
        NewArray newArray = new NewArray();
        int[] arr = newArray.getArr(4, 150, 0);
        int i;

        for (i = 1; i < arr.length; i++) {
            if (arr[i - 1] >= arr[i]) break;
        }
        return i >= arr.length;
    }
}
