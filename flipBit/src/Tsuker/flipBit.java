package Tsuker;

import java.util.Scanner;

public class flipBit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Организация ввода данных

        int valint, lenstr, bitIndex, position, start, end, result;     // Описания переменных
        String valstr, repiStr, newValstr;
        StringBuilder valstrSB, newValstrSB;
        char chari, repi = '0';
        // 1. Ввод и печать целого числа для преобразования
        System.out.println("Enter valint :");
        valint = sc.nextInt();
        System.out.print("valint: ");               // Печать числа
        System.out.println(valint);
        // Ввод целого числа - номер позиции бита (слева направо от 1 до длины битовой строки)
        System.out.println("Enter bitIndex :");     // Номер позиции (нумерация от 1)
        bitIndex = sc.nextInt();
        position = bitIndex - 1;                    // Номер бита (нумерация от 0)
        System.out.print("bitIndex: ");
        System.out.println(bitIndex);               // Печать номера бита
        System.out.print("position: ");
        System.out.println(position);               // Печать позиции бита


        valstr = Integer.toBinaryString(valint);    // Преобразование Integer в строку Binary
        System.out.print("valstr: ");
        System.out.println(valstr);                 // Печать строки битов

        lenstr = valstr.length();                   // Длина строки битов
        System.out.print("lenstr: ");
        System.out.println(lenstr);                 // Печать длины строки битов
        if (bitIndex >= lenstr)                     // Если номер бита больше длины строки
        {System.out.println("Величина bitIndex = или > длины строки valstr!");
            System.exit(-1);};                // Нештатное завершение программы
        chari = valstr.charAt(bitIndex);
        System.out.print("chari: ");
        System.out.println(chari);                  // Печать заменяемого бита

        if (chari == '0') {repi = '1';};            // Если бит равен '0'
        if (chari == '1') {repi = '0';};            // Если бит равен '1'
        System.out.print("repi: ");
        System.out.println(repi);                   // Печать заменяемого бита

        valstrSB = new  StringBuilder(valstr);      // Преобразование String в StringBuilder
        System.out.print("valstrSB: ");
        System.out.println(valstrSB);               // Печать строки типа StringBuilder
        repiStr = Character.toString(repi);         // Преобразование char в String
        System.out.print("repiStr: ");
        System.out.println(repiStr);                // Печать строки заменяющего бита

        start = bitIndex;                           // Начало подстроки символов для замены
        end = bitIndex + 1;                         // Конец подстроки символов для замены
        newValstrSB = valstrSB.replace(start, end, repiStr);    // Замена подстроки на repiStr
        System.out.print("newValstrSB: ");
        System.out.println(newValstrSB);            // Печать новой строки типа StringBuilder

        newValstr = new String(newValstrSB);        // Преобразование StringBuilder в String
        result = Integer.parseInt(newValstr, 2);    // Преобразование String в Integer
        System.out.print("result: ");
        System.out.println(result);                 // Печать целого после замены бита

        System.exit(0);                       // Штатное завершение программы

    };
}