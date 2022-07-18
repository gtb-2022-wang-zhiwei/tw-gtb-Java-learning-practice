import java.util.Arrays;
public class Char2 {
    public static void main(String[] args) {
        int[] scores = new int[] { 88, 77, 51, 66 };
        Score s = new Score(scores);
        s.printscores();
        scores[2] = 99;
        s.printscores();
    }
}
class Score {
    private int[] scores;
    public Score(int[] scores) {
        this.scores = scores;
    }

    public void printscores() {
        System.out.println(Arrays.toString(scores));
    }
}