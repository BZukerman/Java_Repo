package Tsuker;

import java.util.Arrays;                    // Импорт модуля Arrays
import java.util.Scanner;                   // Импорт модуля ввода Scanner

public class Main {

    public static void main(String[] args) {
        int[] ar1 = new int[] {1, 2, 3, 4, 5};      // Объявление и инициализация массива
        int len1 = ar1.length;                      // Длина массива
        System.out.println(len1);                   // 5
        System.out.println(Arrays.toString(ar1));   // [1, 2, 3, 4, 5]
        int mem_2 = ar1[2];                         // Элемент массива с индексом 2
        System.out.println(mem_2);                  // Печать элемента (3)

        int[] ar2 = new int[len1];                  // Новый вспомогательный массив
        int i;                                      // Счетчик цикла
        Scanner sc = new Scanner(System.in);        // Ввод в цикле: 11 12 13 14 15
        for (i = 0; i < len1; i++) {
            ar2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(ar2));       // Печать массива: [11, 12, 13, 14, 15]

        int[] arh;                                      // Массив среза
        arh = Arrays.copyOfRange(ar2, 1, len1);    // Срез массива с индекса 0 до конца
        System.out.println(Arrays.toString(arh));       // Печать среза: [12, 13, 14, 15]
        int lenh = arh.length;                          // Длина среза
        System.out.println(lenh);                       // Печать длины среза: 4
        System.out.println(arh[0]);                     // Первый элемент среза: 12
        System.out.println(arh[lenh - 1]);              // Последний элемент среза: 15

        int lensum = len1 * 2;
        int[] sum = new int [lensum];

        System.arraycopy(ar1, 0, sum, 0, len1);
        System.arraycopy(ar2, 0, sum, len1, len1);  // Source Arr, Start Pos of Source,
                                            // Target Arr, Start Pos of Target, Length of Copy
        System.out.println(Arrays.toString(sum));

    }
}
