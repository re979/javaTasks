package practicalTask3;

import java.util.Scanner;

/**
 * . Реализовать программу, которая в консоль выводит название страны, принимая на
 * вход название города. Программа должна работать до тех пор, пока не будет введено
 * слово “Stop”.
 * Реализовать, используя следующие данные:
 * Москва, Владивосток, Ростов - Россия
 * Рим, Милан, Турин - Италия
 * Ливерпуль, Манчестер, Лондон - Англия
 * Берлин, Мюнхен, Кёльн - Германия
 * При вводе любого другого города, вывести сообщение “Неизвестная страна”.
 * Пример:
 * Милан - ваш ввод в консоль
 * Италия - ответ программы
 * Дублин - ваш ввод в консоль
 * Неизвестная страна - ответ программы
 * Stop - ваш ввод в консоль
 * *программа завершила работу* */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true){
            String city = scanner.nextLine();

            if(city.equals("Stop"))
                break;


            switch (city) {
                case "Москва", "Владивосток", "Ростов" -> System.out.println("Россия");
                case "Рим", "Милан", "Турин" -> System.out.println("Италия");
                case "Ливерпуль", "Манчестер", "Лондон" -> System.out.println("Англия");
                case "Берлин", "Мюнхен", "Кельн" -> System.out.println("Германия");
                default -> System.out.println("Неизвестный город");
            }
        }
    }
}
