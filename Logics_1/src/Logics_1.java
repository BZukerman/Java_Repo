/*
   Укажите пары эквивалентных булевских операторов для:
A) & и ==
B) | и !=
C) | и ||   Ответ
D) ^ и !=   Ответ
 */

public class Logics_1 {
    public static void main(String[] args) {
        boolean a;      // Исходные данные
        boolean b;
        boolean c;      // Результат
        a = false;
        b = false;
        c = (a != b);   // Проверяемое условие
        System.out.println(c);      // печать результата
    }
}
