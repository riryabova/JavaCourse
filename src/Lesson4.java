import java.util.Scanner;
import java.util.function.ToIntFunction;

public class Lesson4 {
    //Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать
    // в переменную int и вывести на экран.
    String num;

    public static void main(String[] args) {
        Lesson4 l4 = new Lesson4();
        l4.input(l4);
        System.out.println("You input binary number = " + l4.num);

        try {
            int decNum = Integer.parseInt(l4.num, 2);
            System.out.println("Your input number in decimal = " + decNum);
        } catch (NumberFormatException e) {
            System.out.println("You input incorrect number");
        }
    }

    void input(Lesson4 l4) {
        String num;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a binary number");
        num = input.nextLine();
        this.num = num;
        return;
    }
}

