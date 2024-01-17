public class Main {
    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static String chekingOS (int i) {
        if (i == 0) {
            return "iOS";
        } else {
            return "Android";
        }
    }

    public static String chekingYearOfProduction (int i) {
        if (i < 2015) {
            return " облегченную ";
        } else {
            return " ";
        }
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2024;
        checkLeapYear(year);

        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2024;
        System.out.println("Установите" + chekingYearOfProduction(clientDeviceYear) + "версию приложения для " + chekingOS(clientOS) + " по ссылке");

    }
}