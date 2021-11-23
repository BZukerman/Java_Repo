package Tsuker;

import java.util.Arrays;                    // Импорт модуля Arrays
//import java.util.Scanner;                   // Импорт модуля ввода Scanner

public class Main {

    public static void main(String[] args) {
        int[] ar1 = new int[]{-1, 7, 9};     // {0, 2, 2} ==> {1, 3} ==> {}
        int len1 = ar1.length;
        int[] result;
        System.out.println(len1);
        System.out.println(Arrays.toString(ar1));

        int[] ar2 = new int[]{1, 5, 7, 7, 9};        // {1, 3} ==> {0, 2, 2}
        int len2 = ar2.length;
        System.out.println(len2);
        System.out.println(Arrays.toString(ar2));

        result = mergeArrays(ar1, ar2);
        System.out.println(Arrays.toString(result));
        //System.out.println(Arrays.toString(mergeArrays(ar1, ar2)));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int maxInt = 2147483647;
        int way = 3;
        int len1 = a1.length;
        if (len1 == 0) {way = 2;}
        int len2 = a2.length;
        if (len2 == 0) {way = 1;}

        int lensum = len1 + len2;
        int[] sum = new int[lensum];
        int i = 0;
        int mem1, mem2;

        switch (way) {
            case 1:
                return a1;

            case 2:
                return a2;

            case 3:
                while (i < lensum) {
                    mem1 = a1[0];
                    mem2 = a2[0];

                    if (mem1 <= mem2) {
                        sum[i] = mem1;
                        a1 = Arrays.copyOfRange(a1, 1, len1 + 1);
                        a1[len1 - 1] = maxInt;
                    }
                    else {
                        sum[i] = mem2;
                        a2 = Arrays.copyOfRange(a2, 1, len2 + 1);
                        a2[len2 - 1] = maxInt;
                    }
                    i = i + 1;
                }
        }
    return sum;
    }
}
