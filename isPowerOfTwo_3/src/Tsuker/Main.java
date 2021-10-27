/*
    Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине
    степенью двойки.
    Идея решения: вычислить логарифм от модуля числа по основанию 2 (double) и сравнить
    с его преобразованной в int (32) величиной.
    Погрешность (разность этих значений) не должна превышать заданную величину epsilon (double).
    Значение числа 0 отсеивается.
*/
package Tsuker;

import java.util.Scanner;                           // Импорт модуля

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Организация ввода данных
        int number;                                 // Вспомогательная переменная
        System.out.println("Enter number :");       // Печать предложения ввода
        number = sc.nextInt();                      // Ввод проверяемого числа
        System.out.print("number: ");               // Печать числа
        System.out.println(number);

        System.out.println(isPowerOfTwo(number));    // Вызов метода isPowerOfTwo для number
        System.exit(77);                       // Код завершения
        };

    public static boolean isPowerOfTwo(int value) {     // Реализация метода
        double epsilon = 1e-5, delta;                   // Погрешность отклонения
        double power;                                   // Логарифм числа по основанию 2
        boolean response = false;                       // Булевская переменная
        int intModule;                                  // Для преобразования к целому

        int module = Math.abs(value);                   // Вычисление модуля числа

        if (value == 0) {return false;};                // Исключить value == 0

        power = Math.log(module) / Math.log(2);         // Логарифм по основанию 2
        System.out.println(power);
        intModule = (int) power;                        // Преобразование к целому 32 бит
        System.out.println(intModule);

        delta = Math.abs(power - intModule);            // Погрешность по отношению к целому
        System.out.println(delta);

        if (delta < epsilon) {response = true;};        // Погрешность < заданной

        return response;                                // Возврат результата
    }
}
