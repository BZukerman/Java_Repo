/*
   Укажите пары эквивалентных булевских операторов для:
A) & и ==
B) | и !=
C) | и ||   Ответ
D) ^ и !=   Ответ
 */

public class Logics_1 {
    public static void main(String[] args) {
        boolean a;
        boolean b;
        boolean c;
        a = false;
        b = false;
        c = (a != b);
        System.out.println(c);
    }
}
