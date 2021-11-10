/*
    Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
    Палиндромом называется строка, которая читается одинаково слева направо и справа налево
    (в том числе пустая).
    При определении "палиндромности" строки должны учитываться только буквы и цифры.
    Пробелы, знаки препинания, а также регистр символов должны игнорироваться.
    Гарантируется, что в метод попадают только строки, состоящие из символов ASCII
    (цифры, латинские буквы, знаки препинания).

    Реализация в стиле Java (Метод public static boolean isPalindrome(String text)
*/
package Tsuker;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Организация ввода данных
        String rowCheck, row1;                      // Объявление переменных (2 строки)
        System.out.println("Enter rowCheck :");     // Печать предложения ввода
        rowCheck = sc.nextLine();                   // Ввод проверяемой строки
        System.out.print(rowCheck);                 // Печать введенной строки
        //row1 = rowCheck.toLowerCase();              // Новая строка в нижнем регистре
        System.out.println();                       // Печать пустой строки
        System.out.print("rowCheck: ");                 // Печать получившейся строки
        System.out.println(rowCheck);
        System.out.println(isPalindrome(rowCheck));     // Вызов метода isPalindrome(String text)
    };

    public static boolean isPalindrome(String text) {
        String row1, row2;                          // Объявление строки
        StringBuffer sb;                            // Объявление объекта StringBuffer
        boolean matching;                           // Объявление булевского объекта
        row1 = text.toLowerCase();                  // Новая строка в нижнем регистре
        row2 = row1.replaceAll("[^a-zA-Z0-9]", "");  // Удаление ненужных символов
        System.out.print("After replace: ");        // Печать получившейся строки
        System.out.println(row2);
        sb = new StringBuffer(row2);                // Получение объекта StringBuffer для реверса строки
        System.out.print("sb: ");                   // Печать объекта StringBuffer
        System.out.println(sb);
        sb.reverse();                               // Реверс объекта StringBuffer
        text = sb.toString();                       // Преобразование объекта StringBuffer в строку
        System.out.print("text: ");                 // Печать строки после реверса
        System.out.println(text);

        matching = row2.equals(text);               // Сравнение содержимого строк
        System.out.print("matching: ");             // Печать результата сравнения
        System.out.println(matching);
        return matching;                            // Возврат результата matching
    }
}
