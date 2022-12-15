public class Main {
    public static void main(String[] args) {
        // Задание 9
        int savings = 29000;
        for (int n = 1; n <= 12; n++) {
        int savingsPerMonth = n * savings;
        double CAPITALISM = savingsPerMonth + (savingsPerMonth * 0.12);
            System.out.println("Месяц " + n + ", сумма накоплений равна " + CAPITALISM + " рублей");
        }
    }
}