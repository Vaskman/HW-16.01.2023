public class Main {
    public static void main(String[] args) {
        System.out.println("HW-16.01.2023");
        //task1
        System.out.println("ЗАДАЧА №1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Интерация цикла возрастание " + i);
        }
        //task2
        System.out.println("ЗАДАЧА №2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Интерация цикла убивание " + i);
        }
        //task3
        System.out.println("ЗАДАЧА №3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Интерация цикла четные " + i);
        }
        //task 4
        System.out.println("ЗАДАЧА №4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Интерация цикла к минусу " + i);
        }
        //task5
        System.out.println("ЗАДАЧА №5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным».");
        }
        //task6
        System.out.println("ЗАДАЧА №6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Интерация последовательности чисел сложения " + i);
        }
        //task7
        System.out.println("ЗАДАЧА №7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Интерация последовательности чисел умножение " + i);
        }
        //task8
        System.out.println("ЗАДАЧА №8");
        int money = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = money + total;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей»");
        }
        //task9
        System.out.println("ЗАДАЧА №9");
        int money1 = 29000;
        int total1 = 0;
        for (int i = 0; i < 12; i++) {
            total1 = total1+ total1 /100;
            total1 = money1 + total1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total1+ " рублей»");
        }
        //task10
        System.out.println("ЗАДАЧА №10");
        int first=2;
        int second=1;
        for (int i=1; i<11; i++){
            first=first;
            second=first*i;
            System.out.println(i+"*"+first+"="+second);
        }
    }
}