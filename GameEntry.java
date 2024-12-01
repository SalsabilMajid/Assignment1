//Suppose that we create an array A of GameEntry objects, which has an integer scores field, and we clone A and store the result in an array B.
// If we then immediately set A[4].score equal to 550,what is the score value of the GameEntry object referenced by B[4]?

public class GameEntry {
    int score;

    public GameEntry(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
