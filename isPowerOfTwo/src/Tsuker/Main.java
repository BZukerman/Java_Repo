/*
    Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине
    степенью двойки.
    Идея решения: в двоичном виде степень двойки представляется символом '1' в соответствующем
    степени разряде, остальные биты заполнены символами '0'.
*/
package Tsuker;

import java.util.Scanner;                           // Импорт модуля

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Организация ввода данных
        int number;
        System.out.println("Enter number :");       // Печать предложения ввода
        number = sc.nextInt();                      // Ввод проверяемого числа
        System.out.print("number: ");               // Печать числа
        System.out.println(number);

        System.out.println(isPowerOfTwo(number));    // Вызов метода isPowerOfTwo для number
        System.exit(77);                       // Код завершения
    }

    public static boolean isPowerOfTwo(int value) {     // Реализация метода
            int module = Math.abs(value);               // Вычисление модуля числа
            int bitCount = Integer.bitCount(module);    // Вычисление количества символов '1'
            boolean response;                           // Булевская переменная
            if (bitCount == 1) {response = true;}       // Если число - степень 2
            else {response = false;};                   // Иначе
            return response;                            // Возврат результата
    }
}
