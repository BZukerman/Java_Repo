/*
Какой тип имеет литерал 0x0bp3?     Ответ: double
Введите имя соответствующего примитивного типа. Напоминаем, что Java чувствительна
к регистру символов.
*/

public class Main {
    public static void main(String[] args) {
        String var = new String("0x0bp3");
        System.out.println(var);
        String result = var.getClass().getName();
        System.out.println(result);
    };
}