
public class Question_5 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print((int) Math.pow(i, j) + " ");
            }
            System.out.println();
        }
    }
}
