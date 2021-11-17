/* Реализуйте метод, вычисляющий факториал заданного натурального числа.
   Поскольку это очень быстро растущая функция будем использовать BigInteger.
   Вычисляется факториал в цикле от 2 до number (был цикл от 1)
*/
package Tsuker;

import java.util.Scanner;                           // Импорт модуля ввода Scanner
import java.math.BigInteger;                        // Импорт модуля java.math.BigInteger

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Организация ввода данных
        int number;
        System.out.println("Enter number :");       // Печать предложения ввода
        number = sc.nextInt();                      // Ввод проверяемого целого числа
        System.out.print("number: ");               // Печать введенного числа
        System.out.println(number);
        System.out.println(factorial(number));      // Вызов метода factorial(number)
    }

    public static BigInteger factorial(int value) {
        int i;                                      // Целочисленный счетчик цикла
        BigInteger mult1, mult2, result;            // Переменный типа BigInteger
        mult1 = new BigInteger("1");            // Инициализация первого сомножителя
        result = mult1;                             // Инициализация результата перед циклом
        for (i = 2; i <= value; i++) {              // Цикл можно начинать с i = 2; а не с i = 1;
            mult2 = BigInteger.valueOf(i);          // Второй сомножитель (преобразование int в BigInteger)
            result = mult1.multiply(mult2);         // Результат произведения (умножение * здесь не работает!)
            mult1 = result;                         // Первый сомножитель для следующей итерации
            }

        return result;                              // Возврат результата произведения
    }
}
