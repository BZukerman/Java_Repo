/*
    Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
    Палиндромом называется строка, которая читается одинаково слева направо и справа налево
    (в том числе пустая).
    При определении "палиндромности" строки должны учитываться только буквы и цифры.
    Пробелы, знаки препинания, а также регистр символов должны игнорироваться.
    Гарантируется, что в метод попадают только строки, состоящие из символов ASCII
    (цифры, латинские буквы, знаки препинания).

    Реализация в процедурном стиле (без использования метода)
*/
package Tsuker;
import java.util.Locale;
import java.util.Scanner;                           // Импорт модуля Scanner

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Организация ввода данных
        String rowCheck = "", row1, row2, row3;     // Объявление переменных (строки)
        StringBuffer sb;                            // Объявление объекта StringBuffer
        boolean matching;                           // Объявление булевского объекта
        System.out.println("Enter rowCheck :");     // Печать предложения ввода
        rowCheck = sc.nextLine();                   // Ввод проверяемой строки
        System.out.print(rowCheck);                 // Печать введенной строки
        row1 = rowCheck.toLowerCase();              // Новая строка в нижнем регистре
        System.out.println();                       // Печать пустой строки
        System.out.print("row1: ");                 // Печать получившейся строки
        System.out.println(row1);
        row2 = row1.replaceAll("[^a-zA-Z0-9]", "");     // Удаление ненужных символов
        System.out.print("After replace: ");        // Печать получившейся строки
        System.out.println(row2);
        sb = new StringBuffer(row2);                // Получение объекта StringBuffer для реверса строки
        System.out.print("sb: ");                   // Печать объекта StringBuffer
        System.out.println(sb);
        sb.reverse();                               // Реверс объекта StringBuffer
        row1 = sb.toString();                       // Преобразование объекта StringBuffer в строку
        System.out.print("row1: ");                 // Печать строки после реверса
        System.out.println(row1);

        matching = row2.equals(row1);               // Сравнение содержимого строк
        System.out.print("matching: ");             // Печать результата сравнения
        System.out.println(matching);

    }
}
