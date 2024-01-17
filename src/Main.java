public class Main {
    public static String checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return " високосный ";
            } else {
                return " невисокосный ";
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

    public static int colculateDeliveryDays(int distance) {
        int days = 1;
        if (distance >= 20) {
           days++;
        }
        if (distance >= 60) {
            days++;
        }
        if (distance > 100) {
            days = -1;
        }
        return days;
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2021;
        System.out.println(year + " год - " + checkLeapYear(year) + " год");

        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2024;
        System.out.println("Установите" + chekingYearOfProduction(clientDeviceYear) + "версию приложения для " + chekingOS(clientOS) + " по ссылке");

        System.out.println("Задача 3");
        int deliveryDistance = 83;
        if (colculateDeliveryDays(deliveryDistance) == -1) {
            System.out.println("Доставки нет");
        } else System.out.println("Доставка занимает дней: " + colculateDeliveryDays(deliveryDistance));

    }
}