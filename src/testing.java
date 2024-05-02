public class testing {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 65, 90};
        int[] testScores = {85, 92, 78, 65, 90};

        System.out.printf("%s %10s \n", "Score", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%4d %10d \n", scores[1], testScores[i]);
        }
    }
}
