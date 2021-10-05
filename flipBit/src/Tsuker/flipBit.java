/*
  Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на
  противоположное. Данная задача актуальна, например, при работе с битовыми полями.
  Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
*/
package Tsuker;

import java.util.Scanner;

public class flipBit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Организация ввода данных
                                                // Описания переменных
        int valint, lenstr, bitIndex, position, start, end, result, index;
        String valstr, repiStr, newValstr;
        StringBuilder valstrSB, newValstrSB;
        char chari, repi  = '0';

        System.out.println("Enter valint :");   // Печать предложения ввода
        valint = sc.nextInt();                  // Ввод
        System.out.print("valint: ");           // Печать
        System.out.println(valint);

        System.out.println("Enter bitIndex :");     // Печать предложения ввода позиции справа
        bitIndex = sc.nextInt();                // Ввод позиции бита для конвертации (от 1)
        position = bitIndex - 1;                // Позиция справа для замены (от 0)
        System.out.print("bitIndex: ");         // Печать
        System.out.println(bitIndex);
        if (bitIndex <= 0) {                    // Проверка валидности индекса
            System.out.println("bitIndex должен быть > 0!");
            System.exit(-1);                // Нештатное завершение программы
        };
        System.out.print("position: ");         // Печать индекса
        System.out.println(position);

        valstr = Integer.toBinaryString(valint);    // Преобразование целого в строку битов
        System.out.print("valstr: ");               // Печать строки битов
        System.out.println(valstr);

        lenstr = valstr.length();                   // Длина строки битов
        System.out.print("lenstr: ");               // Печать
        System.out.println(lenstr);
        index = lenstr - bitIndex;                  // Индекс в строке (слева направо от 0)
        System.out.print("index: ");                // Печать
        System.out.println(index);

        if (bitIndex > lenstr)                  // Проверка валидности индекса
        {System.out.println("Величина bitIndex = или > длины строки valstr!");
            System.exit(-2);};            // Нештатное завершение программы

        chari = valstr.charAt(index);           // Значение бита в позиции (отсчет слева)
        System.out.print("chari: ");            // Печать
        System.out.println(chari);

        if (chari == '0') {repi = '1';};        // Конвертация бита
        if (chari == '1') {repi = '0';};
        System.out.print("repi: ");             // Печать
        System.out.println(repi);

        valstrSB = new StringBuilder(valstr);      // Преобразование типа в StringBuilder
        System.out.print("valstrSB: ");            // Печать
        System.out.println(valstrSB);
        repiStr = Character.toString(repi);         // Преобразование символа в тип String

        System.out.print("repiStr: ");              // Печать инвертированного бита
        System.out.println(repiStr);

        start = index;                              // Вычисление операндов для замены символа
        end = index + 1;
        newValstrSB = valstrSB.replace(start, end, repiStr);    // Замена бита
        System.out.print("newValstrSB: ");          // Печать
        System.out.println(newValstrSB);

        newValstr = new String(newValstrSB);        // Преобразование newValstrSB в String
        result = Integer.parseInt(newValstr, 2);    // Преобразование строки в целое
        System.out.print("result: ");               // Печать числа после замены бита
        System.out.println(result);

        System.exit(0);         // Штатное завершение программы

    };
}