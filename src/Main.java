import java.time.LocalDate;

public class Main {
    //task 1
    public static void vysokosnyYear(int year){
        if (year % 400 == 0 && year > 1584 || year % 100 != 0 && year % 4 == 0 && year > 1584){
            System.out.println(year + " год — високосный год");
        }
        else{
            System.out.println(year + "  год — невисокосный год");
        }
    }

    //task 2
    public static void appVersion(int clientOS, int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неверно указанная ОС или год");
        }
    }

    //task 3
    public static int deliveryTime(int deliveryDistance){
        int deliveryTime = 0;
        if (deliveryDistance <= 20){
            deliveryTime = 1;
            return deliveryTime;
        }
        else if(20 < deliveryDistance && deliveryDistance <= 60){
            deliveryTime = 2;
            return deliveryTime;
        }
        else if(60 < deliveryDistance && deliveryDistance <= 100){
            deliveryTime = 3;
            return deliveryTime;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        vysokosnyYear(1896);
        appVersion(0, 2025);
        int time = deliveryTime(40);
        System.out.println(time);
    }
}