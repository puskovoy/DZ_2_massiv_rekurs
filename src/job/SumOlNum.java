package job;

/**
 * Created by User on 18.01.2016.
 *
 */
public class SumOlNum {

    private int result = 0;

    public int getResult() {
        return result;
    }
//method finds the sum of all digits in the variable result
    public void setResult(String result) {
        for (int i = 0; i < result.length(); i++)
            this.result += Integer.parseInt(result.charAt(i) + "");
    }
}
