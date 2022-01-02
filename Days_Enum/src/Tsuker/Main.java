/*
    Упражнение на тему enum
*/
package Tsuker;

import java.util.Arrays;                            // Импорт модуля Arrays

public class Main {

    public static void main(String[] args) {
        int dh;                                     // Вспомогательная переменная

        for (DayOfWeek day : DayOfWeek.values()) {  // Цикл по элементам перечисления
            //System.out.println(day.ordinal());
            System.out.println(
                    day.ordinal() + " " + day.name());  // Печать пар "номер - название"
        }     // End of for

        System.out.println();
        System.out.println(Arrays.toString(DayOfWeek.values()));    //  Печать элементов
        System.out.println();

        //System.out.println(DayOfWeek.TUESDAY.ordinal());
        dh = DayOfWeek.TUESDAY.ordinal();                   // Выбор значения для TUESDAY
        System.out.println(dh);                             // Печать dh
        if (dh == 1) { System.out.println("Yes");}          // Проверка
        else {System.out.println("No");}
    }     // End of main

    public enum DayOfWeek {             // Объявление перечисления DayOfWeek
        MONDAY ,
        TUESDAY ,
        WEDNESDAY ,
        THURSDAY ,
        FRIDAY ,
        SATURDAY ,
        SUNDAY
    }   // End of enum
}     // End of Days