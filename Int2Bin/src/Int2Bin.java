import java.util.Scanner;                       // Импорт модуля Scanner

public class Int2Bin {                          // Преобразование Int в Bin
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Организация ввода данных
        int valint;                             // Целая переменная
        System.out.println("Enter valint :");   // Предложение ввода
        String valstr;                          // Переменная типа String
        valint = sc.nextInt();                  // Ввод целого числа
        System.out.println(valint);             // Печать введенного числа
        valstr = Integer.toBinaryString(valint);    // Преобразование числа в строку
        System.out.println(valstr);             // Печать двоичной строки
    };
}
