/* Реализуйте метод, вычисляющий факториал заданного натурального числа.
   Поскольку это очень быстро растущая функция будем использовать BigInteger.
   Вычисляется факториал в цикле от 2 до number (был цикл от 1)
   Добавлен оператор switch (0 ==> 1; 1 ==> 1; value > 1 ==> вычисление N!)
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
        BigInteger mult1, mult2, result;            // Переменныe типа BigInteger

        switch (value) {                            // Ветвление по value
            case 0:                                 // Для введенного значения 0
                // return new BigInteger("1");     // Возврат 1
                return BigInteger.ONE;
            case 1:                                 // Для введенного значения 1
                //return new BigInteger("1");     // Возврат 1
                return BigInteger.ONE;
            default:                                // По умолчанию для введенного value > 1
        }                                           // выполняются действия ниже:

        //mult1 = new BigInteger("1");            // Инициализация первого сомножителя
        mult1 = BigInteger.ONE;
        result = mult1;                             // Инициализация результата перед циклом
        for (i = 2; i <= value; i++) {              // Цикл можно начинать с i = 2; а не с i = 1;
            mult2 = BigInteger.valueOf(i);          // Второй сомножитель (преобразование int в BigInteger)
            result = mult1.multiply(mult2);         // Результат произведения (умножение * здесь не работает!)
            mult1 = result;                         // Первый сомножитель для следующей итерации
        }

        return result;                              // Возврат результата произведения
    }
}
