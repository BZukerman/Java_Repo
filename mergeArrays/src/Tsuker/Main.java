/*
    Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один
    отсортированный в том же порядке массив.
    Массивы могут быть любой длины, в том числе нулевой.
    Алгоритм слияния придумал сам. Комментарии поясняют его.
*/
package Tsuker;

import java.util.Arrays;                    // Импорт модуля Arrays
//import java.util.Scanner;                   // Импорт модуля ввода Scanner

public class Main {

    public static void main(String[] args) {
        int[] ar1 = new int[]{-1, 7, 9};    // {0, 2, 2} ==> {1, 3} ==> {} Первый массив
        int len1 = ar1.length;              // Длина массива
        int[] result;                       // Массив для слияния введенных отсортированных
        System.out.println(len1);           // Печать длины первого массива
        System.out.println(Arrays.toString(ar1));   // Печать первого массива

        int[] ar2 = new int[]{1, 5, 7, 7, 9};   // {1, 3} ==> {0, 2, 2} Второй массив
        int len2 = ar2.length;              // Длина массива
        System.out.println(len2);           // Печать длины второго массива
        System.out.println(Arrays.toString(ar2));   // // Печать второго массива

        result = mergeArrays(ar1, ar2);     // Получение результирующего массива
        System.out.println(Arrays.toString(result));    // Печать результирующего массива
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int maxInt = 2147483647;            // Наибольшее целое число в 32-разрядном представлении
        int way = 3;                        // Переменная для ветвления в switch (way)
        int len1 = a1.length;               // длина первого мс=ассива
        if (len1 == 0) {way = 2;}           // Второй путь switch
        int len2 = a2.length;               // длина второго массива
        if (len2 == 0) {way = 1;}           // Первый путь switch

        int lensum = len1 + len2;           // Длина смерженного массива sum
        int[] sum = new int[lensum];        // Массив для слияния отсортированных массивов
        int i = 0;                          // Счетчик цикла - начальное значение
        int mem1, mem2;                     // Переменный для выборки элементов (с индексом 0)

        switch (way) {                      // Переключатель ветвления
            case 1:                         // Если длина второго массива == 0
                return a1;                  // Возврат первого массива

            case 2:                         // Если длина перрого массива == 0
                return a2;                  // Возврат второго массива

            case 3:                         // Если длины обоих массивов не равны 0
                while (i < lensum) {        // Цикл по элементам суммирующего массива
                    mem1 = a1[0];           // Выборки элементов с индексом 0
                    mem2 = a2[0];

                    if (mem1 <= mem2) {     // Условие засылки меньшего элемента
                        sum[i] = mem1;      // Засылка меньшего элемента
                        a1 = Arrays.copyOfRange(a1, 1, len1 + 1);   // Срез с 1 до конца
                        a1[len1 - 1] = maxInt;      // Запись maxInt в конец первого массива
                        //System.out.println(i);      // Отладочная печать
                        //System.out.println(Arrays.toString(a1));
                    }
                    else {
                        sum[i] = mem2;      // Иначе засылаем другой элемент
                        a2 = Arrays.copyOfRange(a2, 1, len2 + 1);   // Срез с 1 до конца
                        a2[len2 - 1] = maxInt;      // Запись maxInt в конец второго массива
                        //System.out.println(i);      // Отладочная печать
                        //System.out.println(Arrays.toString(a2));
                    }
                    i = i + 1;                      // Счетчик для следующей итерации
                }
        }
    return sum;                                     // Возврат смерженного массива
    }
}
