package pro.sky.java.course1;

public class Main<monthNumber, sw> {

    public static void main(String[] args) {
        // write your code here
        int ios = 0;
        if (ios == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            int Android;
            {
                {
                }

                Android = 1;
                if (Android == 1) ;
                {
                    System.out.println("Установите версию приложения для Android по ссылке");
                    {
                    }
                    // Задание 2
                    int clientDeviceYear = 2014;
                    if (Android == 1 && clientDeviceYear <= 2014) {
                        System.out.println("Установите облегченную версию приложения для Android по ссылке ");
                    }
                    int clientDevice = 2014;
                    if (ios == 0 && clientDevice <= 2014) {
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
                    }
                }
            }
            int clientDevice = 2015;
            if (Android == 1 && clientDevice >= 2015) {
                System.out.println("Установите приложение для Android по ссылке ");
            }
            //Задание 3
        }
        int year = 2020;
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Задание 4

        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + deliveryDays + 1);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней:" + deliveryDays + 2);
        } else System.out.println("Мы не сможем доставить Вам карту");


        //Задание 5

        int monthNumber =12;
        switch (monthNumber){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Такого дня не существует");

        }
    }
}

























