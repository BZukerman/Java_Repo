/*
   В Григорианском календаре год является високосным в двух случаях:
   либо он кратен 4, но при этом не кратен 100, либо кратен 400.
   Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры
   (первого года) до заданного года включительно.
 */
import java.util.Scanner;   // Импорт модуля Scanner

public class Counter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год!");
        int x = in.nextInt();           // Объявление вводимого номера года
        System.out.println(leapYearCount(x));   // Вызов класса
        };
    public static int leapYearCount(int year) {
        int multiple4, multiple100, multiple400, count;     // Объявление целых
        multiple4 = year/4;             // Сколько чисел кратных 4?
        multiple100 = year/100;         // Сколько чисел кратных 100?
        multiple400 = year/400;         // Сколько чисел кратных 400?
        count = multiple4 - multiple100 + multiple400;      // Вычисление результата
        return count;                   // Возврат результата
        };
}
