public class main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача №1");
        int clientOS = 4;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("ОС установить не удалось");
        }
    }

    public static void task2() {
        System.out.println("");
        System.out.println("Задача №2");
        int clientOS = 1;
        int clientDeviceYear = 2013;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию для Android по ссылке");
            }
        } else {
            System.out.println("ОС установить не удалось");
        }
    }

    public static void task3() {
        System.out.println("");
        System.out.println("Задача №3");
        int year = 1900;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            // if (year%100 != 0 || year%400 == 0) {
            System.out.println(year + " год является високосным");
            //  }
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}
