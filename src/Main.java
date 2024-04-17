public class Main {
    public static void main(String[] args) {
        int salary = 65_535;
        int total = 0;
        int i = 0;
        while (total < 1_000_000) {
            i++;
            total = (int)(total * 1.01);
            total = total + salary;
            System.out.format("%,d%n", total);
        }
        System.out.println(i);

        int start = 5;
        while (start >= 0) {
            System.out.println(start);
            start -= 1;
        }

        int days = 0;
        if (days == 0) {
            System.out.println("Желаем приятной поездки!");
        } else {
            while (days > 0) {
                System.out.println("До конца поездки осталось " + days + " дней.");
                days --;
            }
            System.out.println("Путешествие окончено. Пора возвращаться домой.");
        }

        int salary2 = 65_535;
        int total2 = 0;
        int i2 = 0;
        for (; total2 < 1_000_000; i2++) {
            total2 *= 1.01;
            total2 = total2 + salary2;
            if (i2 % 5 == 0) {
                System.out.println("Месяц " + i2 + " Итого " + total2);
            }
        }
        System.out.println(total2);

        int go = 0;
        do {
            System.out.println(go);
            go = go - 1;
        }
        while (go > 0);

        int userWantsToContinue = 1;
        int level = 5;
        do {
            System.out.println("Завершен уровень " + level);
            System.out.println("Хотите продолжить?");
            level++;
        }
        while (userWantsToContinue == 1 && level < 5);

        int points = 10;
        do {
            System.out.println("Осталось " + points + " баллов.");
            points--;
        } while (points >= 0);
        System.out.println("Game Over!");
    }
}
