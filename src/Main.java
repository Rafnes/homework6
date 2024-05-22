public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Все целые числа от 1 до 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        //Задание 2
        System.out.println("Все целые числа от 10 до 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        //Задание 3
        System.out.println("Чётные числа от 0 до 17:");
        for (int i = 0; i <= 17; i = i + 2) {
             // подразумевается, что 0 - чётное число (делится на 2 без остатка и окружено нечётными числами)
            System.out.println(i);
            }
        System.out.println();

        //Задание 4
        System.out.println("Все целые числа от 10 до -10:");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        //Задание 5
        System.out.println("Високосные годы с 1904 по 2096:");
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i);
        }
        System.out.println();

        //Задание 6
        System.out.println("Заданная последовательность:");
        for (int i = 7; i < 100; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задание 7;
        System.out.println("Заданная последовательность: ");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задание 8
        int sumPerMonth = 29000;
        int accumulated = 0;
        System.out.println("Накопления за год: ");
        for (int i = 1; i <= 12; i++){
            accumulated = accumulated + sumPerMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + accumulated + " рублей");
        }
        System.out.println();

        //Задание 9
        int deposit = 29000;
        int depositTotal = 0;
        System.out.println("Накопления за год под 12% годовых:");
        for (int i = 1; i <= 12; i++) {
            depositTotal = depositTotal + depositTotal/100;
            depositTotal = depositTotal + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + depositTotal + " рублей");
        }
        System.out.println();

        //Задание 10
        System.out.println("Таблица умножения на 2: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + i * 2);
        }
    }
}