/*
  Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
  Допустимая погрешность – 0.0001 (1E-4).
  Можно использовать класс Math и его методы. Класс Math доступен всегда,
  импортировать его не надо.
 */
package Tsuker;
import java.util.Scanner;               // Импорт модуля Scanner
//
public class Main {
//
    public static void main(String[] args) {
        double a, b, c;                 // Вводимые переменные типа double
        boolean ret;                    // Логическая переменная типа boolean
        Scanner sc = new Scanner(System.in);    // Организация ввода данных
        a = sc.nextDouble();            // Ввод исходных данных
        b = sc.nextDouble();
        c = sc.nextDouble();
        System.out.println(a);          // Вывод исходных данных
        System.out.println(b);
        System.out.println(c);
//
        double ch = a + b;              // Сумма исходных данных
        double defect;                  // Число для сравнения
        double eps;                     // Переменная для погрешности
        defect = ch - c;                // Разность введенной величины и суммы
        eps = Math.abs(defect);         // Погрешность
//
        if (eps < 0.0001)               // Малая погрешность
            {ret = true;}
        else                            // Большая погрешность
            {ret = false;};
        System.out.print(ret);          // Печать результата
    };
}
