/*
Какой тип имеет литерал 0x0bp3?     Ответ: double
Введите имя соответствующего примитивного типа. Напоминаем, что Java чувствительна
к регистру символов.

Dima Kurilchik:
0x0bp3 само по себе является вещественным литералом. Вы же предварительно создаете строку
и спрашиваете у нее имя класса.
*/

public class Main {
    public static void main(String[] args) {
        String var = new String("0x0bp3");
        System.out.println(var);
        String result = var.getClass().getName();
        System.out.println(result);
    };
}