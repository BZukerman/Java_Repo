/*
  Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно
  два истинны (любые).
  Во всех остальных случаях метод должен возвращать false.
 */

public class Logics_2 {
    public static void main(String[] args) {
        boolean a;
        boolean b;
        boolean c;
        boolean d;
        boolean result;
        a = false;       /* int x = System.in.read(); */
        b = false;       /* System.in.nextBoolean(); */
        c = false;        /* System.in.nextBoolean(); */
        d = true;        /* System.in.nextBoolean(); */
        boolean ar[];    /* {false, false, false, false}; */
        ar = new boolean[5];
        ar[0] = a;
        ar[1] = b;
        ar[2] = c;
        ar[3] = d;
        int hel[];
        hel = new int[5];
        int summa = 0;
        for (int i = 0; i < 4; i++) {
            if (ar[i] == true) {
            hel[i] = 1;
            }
        else {
            hel[i] = 0;
            };
        summa = summa + hel[i];
    }
    /* summa = sum(help); */
        if (summa != 2) {
            result = false;
        }
        else {
            result = true;
        };
/*    return result; */
        System.out.print(result);
        }
    }