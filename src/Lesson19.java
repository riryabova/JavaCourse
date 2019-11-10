import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Lesson19 {
/*    Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int
    и вывести на экран. Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.*/


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input a binary number");
        String num = scan.nextLine();
        fun(num);

    }

    private static void fun(String num) {
        int sum = 0;
        int x;
        char c;

        for (int i = 0; i < num.length(); i++) {
            c = num.charAt(num.length() - 1 - i);
            if (c == '1' || c == '0') {
                if (c == '1')
                    x = 1;
                else x = 0;
            } else {
                System.out.println("You input incorrect number");
                break;
            }

            sum += (Math.pow(2, i));
        }
        System.out.println("Your number in decimal = " + sum);
    }

}

