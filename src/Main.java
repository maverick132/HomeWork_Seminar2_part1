import java.util.Scanner;
//        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//        Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class Main {
    public static void main(String[] args) {
        Number number = new Number();
        number.output("Введите число типа float");
        number.input();
        number.output(String.format("Вы ввели число %f", number.getNumb()));

    }
}