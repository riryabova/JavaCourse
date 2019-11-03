import java.util.Scanner;

public class Lesson13 {
    private String s;

    //Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны
    // в соответствующие переменные. Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение.
    public static void main(String[] args) {
        Lesson13 s1 = new Lesson13();
        s1.input(s1);
        Lesson13 s2 = new Lesson13();
        s2.input(s2);

        int len1 = s1.s.length();
        int len2 = s2.s.length();

        if (s1.s.length() == s2.s.length()) {
            System.out.println("Lengths equal");
        } else if (len1 > len2) {
            System.out.println("Первая строка длинее = " + s1.s);
        } else {
            System.out.println("Вторая строка длинее = " + s2.s);
        }
    }

    void input(Lesson13 l13) {
        String s;
        Scanner inputS = new Scanner(System.in);
        System.out.println("Input your string");
        s = inputS.nextLine();
        this.s = s;
        return;
    }
}



