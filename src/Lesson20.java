import java.util.Arrays;
import java.util.Scanner;

public class Lesson20 {

/*    Написать программу сортировки по возрастанию заданного пользователем массива чисел. Пользователь программы должен
    задавать размер массива и наполнять его числами. Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.*/

/*    Быстрая сортировка
Выбрать опорный элемент из массива. Обычно опорным элементом является средний элемент.
Разделить массив на два подмассива: элементы, меньше опорного и элементы, больше опорного.
Рекурсивно применить сортировку к двум подмассивам.*/

    public static void main(String[] args) {
        int num = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Input amount of elements");
        num = input.nextInt();

        int mas[] = new int[num];
        for (int i = 0; i < num; i++) {
            Scanner masElement = new Scanner(System.in);
            System.out.println("Input " + i + " element");
            mas[i] = input.nextInt();
        }
        System.out.println("Your mas:");
        for (int j = 0; j < num; j++) {
            System.out.println(j + " element = " + mas[j]);
        }

        int x = 0;
        int y = mas.length - 1;

        sort(mas, x, y);
        System.out.println("Your new mas:");
        for (int j = 0; j < num; j++) {
            System.out.println(j + " element = " + mas[j]);
        }
    }


    public static void sort(int[] mas, int x, int y) {
        if (x >= y)
            return;
        int middle = x + (y - x) / 2;
        int opElement = mas[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = x;
        int j = y;
        while (i <= j) {
            while (mas[i] < opElement) {
                i++;
            }

            while (mas[j] > opElement) {
                j--;
            }

            if (i <= j) {
                int t = mas[i];
                mas[i] = mas[j];
                mas[j] = t;
                i++;
                j--;
            }
        }

        // рекурсия
        if (x < j) sort(mas, x, j);
        if (y > i) sort(mas, i, y);
    }

}

