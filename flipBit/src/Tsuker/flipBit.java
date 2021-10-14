/*
  Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на
  противоположное. Данная задача актуальна, например, при работе с битовыми полями.
  Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
  Использован совет коллеги Dima Kurilchik: целые от -2147483648 до 2147483647
  Для преобразования бинарной строки в int нужно использовать метод parseUnsignedInt(...)
  для беззнаковых представлений.
*/
package Tsuker;

import java.util.Scanner;

public class flipBit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Организация ввода данных
                                                // Описания переменных
        int valint, lenstr, bitIndex, position, start, end, result, index, bits = 32;
        String valstr, repiStr, newValstr, appendix, fill = "0";
        StringBuilder valstrSB, newValstrSB;
        char chari, repi  = '0';

        System.out.println("Enter valint :");   // Печать предложения ввода
        valint = sc.nextInt();                  // Ввод
        System.out.print("valint: ");           // Печать
        System.out.println(valint);

        System.out.println("Enter bitIndex :"); // Печать предложения ввода позиции справа
        bitIndex = sc.nextInt();                // Ввод позиции бита для конвертации (от 1)
        position = bitIndex - 1;                // Позиция справа для замены (от 0)
        System.out.print("bitIndex: ");         // Печать
        System.out.println(bitIndex);
        if (bitIndex <= 0) {                    // Проверка валидности индекса
            System.out.println("bitIndex должен быть > 0!");
            System.exit(-1);              // Нештатное завершение программы
        };
        System.out.print("position: ");         // Печать индекса
        System.out.println(position);

        valstr = Integer.toBinaryString(valint);    // Преобразование целого в строку битов
        //valstr = Integer.toString(valint, 2);     // Дает результат для int < 0 (преобразует только модуль числа!)
        System.out.print("valstr: ");               // Печать строки битов
        System.out.println(valstr);

        lenstr = valstr.length();                   // Длина строки битов
        System.out.print("lenstr: ");               // Печать
        System.out.println(lenstr);

        if (lenstr < bits)                  // Т.е. двоичный код числа > 0 дополняется нулями слева
        {
            appendix = fill.repeat(bits - lenstr);      // Строка дополнения до 32 символов
            valstr = appendix + valstr;                 // Получение строки длиной 32 символа
            System.out.print("valstr_new: ");           // Печать
            System.out.println(valstr);
        };

        index = bits - bitIndex;                // Индекс в строке из 32 символов (слева направо от 0)
        System.out.print("index: ");            // Печать
        System.out.println(index);

        if (bitIndex > bits)                    // Проверка валидности индекса в 32 битной строке
            {System.out.println("Величина bitIndex > 32!");
             System.exit(-2);};           // Нештатное завершение программы

        chari = valstr.charAt(index);           // Значение бита в позиции (отсчет слева, строка 32 бит)
        System.out.print("chari: ");            // Печать
        System.out.println(chari);

        if (chari == '0') {repi = '1';};        // Конвертация бита
        if (chari == '1') {repi = '0';};
        System.out.print("repi: ");             // Печать
        System.out.println(repi);

        valstrSB = new StringBuilder(valstr);      // Преобразование типа в StringBuilder
        System.out.print("valstrSB: ");            // Печать
        System.out.println(valstrSB);
        repiStr = Character.toString(repi);        // Преобразование символа в тип String

        System.out.print("repiStr: ");             // Печать инвертированного бита
        System.out.println(repiStr);

        start = index;                             // Вычисление операндов для замены символа
        end = index + 1;
        newValstrSB = valstrSB.replace(start, end, repiStr);    // Замена заданного бита
        System.out.print("newValstrSB: ");         // Печать
        System.out.println(newValstrSB);

        newValstr = new String(newValstrSB);        // Преобразование newValstrSB в String
        //result = Integer.parseInt(newValstr, 2);    // Преобразование строки в целое (знаковое представление)
        result = Integer.parseUnsignedInt(newValstr, 2);    // Преобразование строки в целое(беззнаковое представление)
        System.out.print("result: ");               // Печать числа после замены бита
        System.out.println(result);

        System.exit(0);         // Штатное завершение программы

    };
}