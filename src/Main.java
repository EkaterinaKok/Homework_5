//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Задача 1");
        byte clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println();

        //Task 2
        System.out.println("Задача 2");
        String operationSystem;
        byte clientOS = 1;
        short yearVersion = 2015;
        short clientDeviceYear = 2018;
        if (clientOS == 0) {
            operationSystem = "iOS";
        } else {
            operationSystem = "Android";
        }
        if (clientDeviceYear < yearVersion) {
            System.out.println("Установите облегченную версию приложения для " + operationSystem + " по ссылке.");
        } else {
            System.out.println("Установите версию приложения для " + operationSystem + " по ссылке.");
        }
        System.out.println();

        //Task 3
        System.out.println("Задача 3");
        int firstYearLeap = 1584;
        int year = 2021;
        if (year >= firstYearLeap) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("Год " + year + " является високосным.");
            } else {
                System.out.println("Год " + year + " не является високосным.");
            }
        } else {
            System.out.println("Год " + year + " должен быть больше или равен 1584 г.");
        }
        System.out.println();

        //Task 4
        System.out.println("Задача 4");
        short deliveryDistance = 95;
        short deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 60) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 100) {
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