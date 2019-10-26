import java.util.Scanner;

public class Lesson12 {
    //Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.
    public static void main(String[] args) {

        String s;

        Scanner inputS = new Scanner(System.in);
        System.out.println("Input your string");
        s = inputS.nextLine();
        s = s.replaceAll("\\s+", "");
        System.out.println("Your new string = " + s);

    }
}
