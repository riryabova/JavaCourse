import java.util.Scanner;

public class Lesson11 {
    //Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.
    public static void main(String[] args) {
        String s;

        Scanner inputS = new Scanner(System.in);
        System.out.println("Input your string");
        s = inputS.nextLine();
        System.out.println("Your string = " + s);

    }
}
