/*
  Реализуйте метод, возвращающий true, если среди четырех его аргументов
  ровно два истинны (любые).
  Во всех остальных случаях метод должен возвращать false.
 */

import java.util.Scanner;

public class Logics_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ah, bh, ch, dh;
        boolean a = false, b = false, c = false, d = false, result = false;
        boolean ar [];
        ar = new boolean [4];
        int summa = 0;

        System.out.println("Введите cимвол t для true или f для false:");

        ah = sc.nextLine();
        bh = sc.nextLine();
        ch = sc.nextLine();
        dh = sc.nextLine();

        if (ah.matches ("t")) {
            a = true;
            };
        if (ah.matches ("f")) {
            a = false;
            };
/*        System.out.println(a);  */
        if (bh.matches ("t")) {
            b = true;
            };
        if (bh.matches ("f")) {
            b = false;
            };
/*        System.out.println(b);  */
        if (ch.matches ("t")) {
            c = true;
            };
        if (ch.matches ("f")) {
            c = false;
            };
/*        System.out.println(c);  */
        if (dh.matches ("t")) {
            d = true;
            };
        if (dh.matches ("f")) {
            d = false;
            };
/*        System.out.println(d);  */

        ar[0] = a;
/*        System.out.println(ar[0]);  */
        ar[1] = b;
/*        System.out.println(ar[1]);  */
        ar[2] = c;
/*        System.out.println(ar[2]);  */
        ar[3] = d;
/*        System.out.println(ar[3]);  */
        int hel[];
        hel = new int[4];
        for (int i = 0; i <= 3; i++) {
            if (ar[i] == true) {
                hel[i] = 1;
                };
            if (ar[i] == false) {
                hel[i] = 0;
                };
/*            System.out.println(hel[i]);  */
            summa = summa + hel[i];
/*            System.out.println(summa);  */
        }
/*        System.out.println(summa);  */
    /* summa = sum(help); */
        if (summa != 2) {
            result = false;
            }
        if (summa == 2) {
            result = true;
        };
/*    return result; */
        System.out.print(result);
        }
    }