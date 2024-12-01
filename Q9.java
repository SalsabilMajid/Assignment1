public class Q9 {
    public static void main(String[] args) {
        GameEntry[] A = new GameEntry[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = new GameEntry(i * 99);
        }

        GameEntry[] B = A.clone();

        A[4].setScore(550);

        System.out.println("Score in A[4]: " + A[4].getScore());
        System.out.println("Score in B[4]: " + B[4].getScore());
    };
}
