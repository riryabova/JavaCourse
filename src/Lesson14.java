import java.util.Scanner;

/*Необходимо написать программу, которая будет реализовывать следующие действия:
        1. Ввод числа с клавиатуры и запись его в строковую переменную S

        2. Конвертация строковой переменной S в числовую переменную X типа int

        3. Конвертация числа X типа int в число Y типа double

        Все три числа разных типов необходимо в столбик вывести на экран*/

public class Lesson14 {
    public static void main(String[] args) {

        String s;

        Scanner inputS = new Scanner(System.in);
        System.out.println("Input your number");
        s = inputS.nextLine();
        int x = Integer.parseInt(s);
        double y = (double) x;
        System.out.println("String s = " + s);
        System.out.println("Integer x = " + x);
        System.out.println("Double y = " + y);
    }
}
