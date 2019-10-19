import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Lesson6 {

    //Написать программу, которая будет выполнять следующие действия:

    //1. Ввод трех чисел с клавиатуры x, y, z
    //2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
    //3. Деление среднего арифметического на 2 без остатка
    //4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
    float num;

    public static void main(String[] args) {
        Lesson6 x = new Lesson6();
        Lesson6 y = new Lesson6();
        Lesson6 z = new Lesson6();
        x.input(x);
        y.input(y);
        z.input(z);
        System.out.println("Your x=" + x.num + ", y=" + y.num + ", z=" + z.num);

        float avg = (x.num + y.num + z.num) / 3;
        System.out.println("Average =" + avg);

        int halfAvg=(int)avg/2;
        System.out.println("halfAvg="+halfAvg);

        if (halfAvg>3){
            System.out.println("Программа выполнена корректно");
        }


    }

    void input(Lesson6 l6) {
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


}
