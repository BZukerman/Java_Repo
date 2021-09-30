package Tsuker;

import java.util.Scanner;

public class flipBit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valint, lenstr, bitIndex, position, start, end, result, index;
        String valstr, repiStr, newValstr;
        StringBuilder valstrSB, newValstrSB;
        char chari, repi  = '0';

        System.out.println("Enter valint :");
        valint = sc.nextInt();
        System.out.print("valint: ");
        System.out.println(valint);

        System.out.println("Enter bitIndex :");
        bitIndex = sc.nextInt();
        position = bitIndex - 1;
        System.out.print("bitIndex: ");
        System.out.println(bitIndex);
        if (bitIndex == 0) {
            System.out.println("bitIndex должен быть > 0!");
            System.exit(-1);                // Нештатное завершение программы
        };
        System.out.print("position: ");
        System.out.println(position);

        valstr = Integer.toBinaryString(valint);
        System.out.print("valstr: ");
        System.out.println(valstr);

        lenstr = valstr.length();
        System.out.print("lenstr: ");
        System.out.println(lenstr);
        index = lenstr - bitIndex;
        System.out.print("index: ");
        System.out.println(index);

        if (bitIndex > lenstr)
        {System.out.println("Величина bitIndex = или > длины строки valstr!");
            System.exit(-2);};            // Нештатное завершение программы

        chari = valstr.charAt(index);
        System.out.print("chari: ");
        System.out.println(chari);

        if (chari == '0') {repi = '1';};
        if (chari == '1') {repi = '0';};
        System.out.print("repi: ");
        System.out.println(repi);

        valstrSB = new  StringBuilder(valstr);
        System.out.print("valstrSB: ");
        System.out.println(valstrSB);
        repiStr = Character.toString(repi);

        System.out.print("repiStr: ");
        System.out.println(repiStr);

        start = index;
        end = index + 1;
        newValstrSB = valstrSB.replace(start, end, repiStr);
        System.out.print("newValstrSB: ");
        System.out.println(newValstrSB);

        newValstr = new String(newValstrSB);
        result = Integer.parseInt(newValstr, 2);
        System.out.print("result: ");
        System.out.println(result);

        System.exit(0);     // Штатное завершение программы

    };
}