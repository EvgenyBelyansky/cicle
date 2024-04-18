import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа ко 2-му уроку по циклам.");
        System.out.println("\nЗадача № 1");
        System.out.println("Вариант 1 накопление без процентов");
        int money = 0;
        int moneyGrowth = 15_000;
        int month = 0;
        while (money < 2_459_000) {
            month++;
            money = money + moneyGrowth;
            System.out.format("Месяц %d, сумма накоплений равна %,d рублей%n", month, money);
        }
        System.out.printf("Потребовалось %d месяца, чтобы накопить сумму %,d рублей%n", month, money);

        System.out.println("\nВариант 2 накопление с процентами");
        int money2 = 0;
        int moneyGrowth2 = 15_000;
        int month2 = 0;
        while (money2 < 2_459_000) {
            month2++;
            money2 = money2 + moneyGrowth2;
            money2 = (int) (money2 * 1.01);
            System.out.format("Месяц %d, сумма накоплений равна %,d рублей%n", month2, money2);
        }
        System.out.printf("Потребовалось %d месяца, чтобы накопить сумму %,d рублей%n", month2, money2);

        System.out.println("\nЗадача № 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println();

        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадача № 3");
        System.out.println("Вариант 1 с учетом увеличения");
        int populationCountryY = 12_000_000;
        int birthRateCountryYPer1000People = 17;
        int mortalityCountryYPer1000People = 8;
        for (int year = 1; year <= 10; year++) {
            int populationGrowthCountryY = populationCountryY / 1000 *
                    birthRateCountryYPer1000People - mortalityCountryYPer1000People;
            populationCountryY += populationGrowthCountryY;
            System.out.format("Год %d, численность населения составляет %,d.%n", year, populationCountryY);
        }

        System.out.println("\nВариант 2 без учета увеличения");
        int populationCountryY2 = 12_000_000;
        int birthRateCountryYPer1000People2 = 17;
        int mortalityCountryYPer1000People2 = 8;
        int populationGrowthCountryY2 = populationCountryY2 / 1000 *
                (birthRateCountryYPer1000People2 - mortalityCountryYPer1000People2);
        for (int year = 1; year <= 10; year++) {
            populationCountryY2 += populationGrowthCountryY2;
            System.out.format("Год %d, численность населения составляет %,d.%n", year, populationCountryY2);
        }

        System.out.println("\nЗадача № 4");
//        System.out.println("Вариант 1: Василий не докладывает по начальной сумме ежемесячно");
        double vasilyMoney = 15_000;
        int month4 = 0;
        while (vasilyMoney < 12_000_000) {
            month4++;
            vasilyMoney = vasilyMoney * 1.07;
            System.out.format("Месяц %d, сумма накоплений %,.2f рублей.%n", month4, vasilyMoney);
        }
        System.out.printf("Чтобы накопить %,.2f рублей Василию понадобилось %d месяцев%n", vasilyMoney, month4);

        System.out.println("\nЗадача № 5");
        int vasilyMoney3 = 15_000;
        int month6 = 0;
        double result2 = 0;
        while (result2 < 12_000_000) {
            month6++;
            result2 = (result2 + vasilyMoney3) * 1.07;
            if (month6 % 6 == 0) {
                System.out.format("Месяц %d, сумма накоплений %,.2f рублей.%n", month6, result2);
            }
        }
        System.out.printf("Чтобы накопить %,.2f рублей Василию понадобилось %d месяцев.%n", result2, month6);

        System.out.println("\nЗадача № 6");
        int vasilyMoney6 = 15_000;
        int months = 0;
        double result6 = 0;
        while (months <= 108) {
            months++;
            result6 = (result6 + vasilyMoney6) * 1.07;
            if (months % 6 == 0) {
                System.out.printf("За %d месяцев накопили %,.2f рублей.%n", months, result6);
            }
        }

        System.out.println("\nЗадача № 7");
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            = scanner.nextInt();
        int firstFriday = 1;
        for (int j = firstFriday; j <= 31; j += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.%n", j);
        }
//    }

//        System.out.println("\nЗадача № 8");
//        int baseYear = 2024;
//        int initialYear = baseYear - 200;
//        int finalYear = baseYear + 100;
//
//        for (int j = 0; j < finalYear; j += 79) {
//            if (j >= initialYear) {
//                System.out.println(j);
//            }
//        }

        System.out.println("\nЗадача № 8");
        int baseYear = 2024;
        int initialYear = baseYear - 200;
        int finalYear = baseYear + 100;

        for (int j = initialYear; j < finalYear; j++) {
            if (j % 79 == 0) {
                System.out.println(j);
            }
        }
    }
}
