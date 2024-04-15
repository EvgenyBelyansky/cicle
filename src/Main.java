public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\nЗадача № 2");
        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }

        System.out.println("\nЗадача № 3");
        for (int k = 0; k <= 17; k += 2) {
            System.out.println(k);
        }

        System.out.println("\nЗадача № 4");
        for (int p = 10; p >= -10; p--) {
            System.out.println(p);
        }

        System.out.println("\nЗадача № 5");
        for (int x = 1904; x <= 2096; x += 4) {
            if (x % 100 != 0 || x % 400 == 0) {
                System.out.println(x + " год является високосным.");
            }
        }

        System.out.println("\nЗадача № 6");
        for (int z = 7; z <= 98; z += 7) {
            System.out.println(z);
        }

        System.out.println("\nЗадача № 7");
        for (int c = 1; c <= 512; c *= 2) {
            System.out.println(c);
        }

        System.out.println("\nЗадача № 8");
        int deposit = 29000;
        int total = 0;
        for (int month = 1; month <= 12; month++) {
            total = total + deposit;
            System.out.printf("\nМесяц %s, сумма накоплений равна %s рублей", month, total);
        }


        System.out.println("\n\nЗадача № 9");
        for (int i = 1, deposit2 = 29000; i <= 12; i++, deposit2 += 29000) {
            deposit2 *= 1.01;
            System.out.printf("\nМесяц %s, сумма накоплений равна %s рублей", i, deposit2);
        }

        System.out.println("\n\nЗадача № 9.2");
        for (int i = 1, deposit2 = 0; i <= 12; i++) {
            deposit2 = (int) ((deposit2 + 29000) * 1.01);
            System.out.printf("\nМесяц %s, сумма накоплений равна %s рублей", i, deposit2);
        }


        System.out.println("\n\nЗадача № 10");
        int x = 2;
        int y = 1;
        int resultXY;
        for (; y <= 10; y++) {
            resultXY = x * y;
            System.out.printf("%s*%s=%s%n", x, y, resultXY);
        }
    }
}
