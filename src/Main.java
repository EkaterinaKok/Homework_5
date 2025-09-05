//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Задача 1");
        byte iOs = 0;
        byte android = 1;
        byte clientOs = 0;
        if (clientOs == iOs) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == android) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println();

        //Task 2
        System.out.println("Задача 2");
        byte iOs2 = 0;
        byte android2 = 1;
        byte clientOs2 = 0;
        short yearVersion = 2015;
        short clientDeviceYear = 2020;
        if (clientOs2 == iOs2 && clientDeviceYear < yearVersion) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOs2 == iOs2 && clientDeviceYear >= yearVersion) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOs2 == android2 && clientDeviceYear < yearVersion) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOs2 == android2 && clientDeviceYear >= yearVersion) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println();

        //Task 3
        System.out.println("Задача 3");
        int firstYearLeap = 1584;
        int year3 = 2021;
        if (year3 >= firstYearLeap && year3 % 100 == 0 && year3 % 400 == 0) {
            System.out.println("Год " + year3 + " является високосным.");
        } else if (year3 >= firstYearLeap && year3 % 4 == 0) {
            System.out.println("Год " + year3 + " является високосным.");
        } else {
            System.out.println("Год " + year3 + " не является високосным.");
        }
        if (year3 < firstYearLeap) {
            System.out.println("Год " + year3 + " меньше 1584 года, в котором ввели високосный год.");
        }
        System.out.println();

        //Task 4
        System.out.println("Задача 4");
        short deliveryDistance = 95;
        short deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if ((deliveryDistance >= 60 && deliveryDistance < 100)) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
        System.out.println();

        //Task 5
        System.out.println("Задача 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима.");
                break;
            case 3, 4, 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна.");
                break;
            case 6, 7, 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето.");
                break;
            case 9, 10, 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень.");
                break;
            default:
                System.out.println(monthNumber + "-ого месяца не существует.");
        }
    }

}