public class Main {
    public static void main(String[] args) {
        // Задание 8
        int savings = 29000;
        for (int n = 1; n <= 12; n++) {
            int savingsPerMonth = n * savings;
            System.out.println("Месяц " + n + ", сумма накоплений равна " + savingsPerMonth + " рублей");
        }
    }
}