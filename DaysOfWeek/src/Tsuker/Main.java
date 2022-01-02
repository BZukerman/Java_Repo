/*
    Реализация примера из лекции (enum DayOfWeek)
*/
package Tsuker;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        for ( DayOfWeek day : DayOfWeek.values()) {     // Цикл по элементам enum DayOfWeek
            System.out.println(
                    day.ordinal() + " " + day.name());  // Печать пар Номер - название дня
        }
        System.out.println();                           // Печать пустой строки
        System.out.println(Arrays.toString(DayOfWeek.values()));    // Печать массива значений перечисления
    }

    public enum DayOfWeek {             // Определение перечисления
        MONDAY ,
        TUESDAY ,
        WEDNESDAY ,
        THURSDAY ,
        FRIDAY ,
        SATURDAY ,
        SUNDAY
    }
}