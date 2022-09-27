public class Question_4 {
    public static void main(String[] args) {
        int people = 80000;
        int year = 0;
        while (people < 150000) {
            people += 0.05 * people;
            year++;
        }
        System.out.println("Population first exceed 150000 after " + year + " years");
    }
}
