import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Lesson7 {
    //Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number. В программе должны присутствовать константы X, Y, Z.
    // Программа должна сравнивать введенное значение с клавиатуры со значением констант и вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
    // Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"

    float num;
    int x = 1;
    int y = 2;
    int z = 3;


    public static void main(String[] args) {
        Lesson7 l7 = new Lesson7();
        l7.input(l7);
        l7.comparison(l7);
    }

    void input(Lesson7 l7) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Input any number");
            num = input.nextFloat();

        } catch (InputMismatchException e) {
            System.out.println(e.getStackTrace());
            input.useLocale(Locale.US);  //с точкой берет разделителем
            num = input.nextFloat();
            this.num = num;
            return;
        }
        this.num = num;
        return;
    }

    void comparison(Lesson7 l7) {
        if (l7.num == x || l7.num == y || l7.num == z) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }
    }
}
