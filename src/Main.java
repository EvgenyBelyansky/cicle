public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация цикла " + i);
        }

        for (int i = 2020; i < 2070; i += 4) {
            System.out.println("Високосный год " + i);
        }

        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        int salary = 65_535;
        int total = 0;
        for (int i = 0; total < 1_000_000; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.printf("\nМесяц %s Итого %s%n", i, total);
        }

        int salary2 = 65_535;
        int total2 = 0;
        for (int i = 0; i < 12; i++) {
            total2 = total2 + salary2;
        }
        System.out.println("\n" + total2);

        int salary3 = 65_535;
        int total3 = 0;
        for (int i = 1; i <= 12; i++) {
            total3 = total3 + total / 100;
            total3 = total3 + salary3;
            System.out.printf("Месяц %s Итого %s%n", i, total3);
        }
        System.out.println("Итого за год " + total3);
    }
}
