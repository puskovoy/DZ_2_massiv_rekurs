package job;

/**
 * Created by User on 23.01.2016.
 */
public class Hanoi {
    private int Moves = 0;//contains count of moves

    public int getMoves() {//get count of muves
        return Moves;
    }

    public void MoveHanoi(int NumDisk, int start, int end, int buf) {
        Moves += 1;//add move

        if (NumDisk == 1) {
            System.out.println(start + " --> " + end);
            return;
        }

        MoveHanoi(NumDisk - 1, start, buf, end);//mix the sticks

        System.out.println(start + " --> " + end);

        MoveHanoi(NumDisk - 1, buf, end, start);//mix the sticks

    }
}
