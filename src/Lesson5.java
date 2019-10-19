import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

//Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.
public class Lesson5 {
    float num;

    public static void main(String[] args) {
        Lesson5 l5 = new Lesson5();
        l5.input(l5);
        System.out.println("You input number = " + l5.num);
        l5.multiplication(l5);
    }

    void input(Lesson5 l5) {
        float num = 0;
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

    void multiplication(Lesson5 l5) {
        System.out.println("1*" + l5.num + "=" + 1 * l5.num);
        System.out.println("2*" + l5.num + "=" + 2 * l5.num);
        System.out.println("3*" + l5.num + "=" + 3 * l5.num);
        System.out.println("4*" + l5.num + "=" + 4 * l5.num);
        System.out.println("5*" + l5.num + "=" + 5 * l5.num);
        System.out.println("6*" + l5.num + "=" + 6 * l5.num);
        System.out.println("7*" + l5.num + "=" + 7 * l5.num);
        System.out.println("8*" + l5.num + "=" + 8 * l5.num);
        System.out.println("9*" + l5.num + "=" + 9 * l5.num);
        System.out.println("10*" + l5.num + "=" + 10 * l5.num);
    }
}
