import java.util.Scanner;

public class Lesson21 {

    //Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу. Пользователь вводит текущий курс и количество рублей.
    // Итоговое значение должно быть округлено до двух знаков после запятой. (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
    public static void main(String[] args) {
        float rate = 1;
        float rub = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите курс доллара");
        try {
            rate = scan.nextFloat();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так." + e);
        }
        System.out.println("Введите количество рублей");
        try {
            rub = scan.nextFloat();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так." + e);
        }

        float usd = rub / rate;
        String usdF = String.format("%.2f", usd);
        System.out.println("Итого: " + usdF + " долларов");
    }
}
