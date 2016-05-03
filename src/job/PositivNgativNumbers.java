package job;

public class PositivNgativNumbers {

    public void getNumPositNegat() {
        NewArray newArray = new NewArray();
        int[] arr = newArray.getArr(10, 11, 5);
        String numFirst = "";

        if (arr[0] == 0) numFirst = "zero";
        else if (arr[0] > 0) numFirst = "positiv";
        else if (arr[0] < 0) numFirst = "negativ";
        System.out.println("The first number is " + numFirst);
    }
}
