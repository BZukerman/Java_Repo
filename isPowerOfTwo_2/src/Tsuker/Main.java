package Tsuker;

import java.util.Scanner;                           // Импорт модуля
// import org.apache.commons.lang3.StringUtils;     // Импорт библиотеки apache StringUtils

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
        int module = Math.abs(value);                   // Вычисление модуля числа
        String valstr;                              // Строка бит
        int countOf1 = 0, lenStr, i;                // Вспомогательные переменные
        char biti;

        valstr = Integer.toBinaryString(module);    // Преобразование целого в строку битов
        lenStr = valstr.length();                   // Длина строки бит

        for (i = 0; i < lenStr; i++) {              // Цикл по битам строки
            biti = valstr.charAt(i);                // Симааол текущего бита
            if (biti == '1') {countOf1 = countOf1 + 1;};    // Счетчик символов '1'
            };

        boolean response;                           // Булевская переменная
        if (countOf1 == 1) {response = true;}       // Если число - степень 2
        else {response = false;};                   // Иначе
        return response;                            // Возврат результата
    }
}
