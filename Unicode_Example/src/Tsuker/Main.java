/*
    Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после
    символа "\" (обратный слэш) на расстоянии a.
*/
package Tsuker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Организация ввода данных

        int ah;
        System.out.println("Enter ah :");       // Печать предложения ввода
        ah = sc.nextInt();                      // Ввод положения символа после '\'
        System.out.print("ah: ");               // Печать
        System.out.println(ah);

        System.out.println(charExpression(ah));     // Вызов метода charExpression для ah
        System.exit(77);                      // Код завершения
    }
    public static char charExpression(int a) {
        int first = '\\';                           // Символ '\' -первое слагаемое
        //System.out.print("first: ");              // Печать
        //System.out.println(first);
        int second = a;                             // Второе слагаемое
        //System.out.print("second: ");             // Печать
        //System.out.println(second);
        int result = first + second;                // Сумма (целое)
        //System.out.print("result: ");             // Печать
        //System.out.println(result);
        return (char) result;                       // Возврат результата
    }
}