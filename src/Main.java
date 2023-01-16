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
            for (int year = 1904; year <= 2096; year ++) {
                if (year % 4==0 && year % 100 !=0 || year % 400 ==0)
                System.out.println(year + " год является високосным».");
            }
            //task6
            System.out.println("ЗАДАЧА №6");
            for (int i = 7; i <= 98; i = i + 7) {
                System.out.print(i+" ");
            }
        System.out.println();
            //task7
            System.out.println("ЗАДАЧА №7");
            int number = 1;
            for (int i = 0; i<9; i++) {
                number=number*2;
                System.out.print(number+" ");
            }
        System.out.println();


            //task8
            System.out.println("ЗАДАЧА №8");
            int money = 29000;
            int total = 0;
            for (int i = 1; i <=12; i++) {
                total += money;
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей»");
            }
            //task9
            System.out.println("ЗАДАЧА №9");
            double totalPerson=0;
        double person = 0.01;
        for (int i = 1; i <=12; i++) {
            totalPerson = (totalPerson+money) *(1+person);
                System.out.println("Месяц " + i + " сумма накоплений равна " + totalPerson+ " рублей»");
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