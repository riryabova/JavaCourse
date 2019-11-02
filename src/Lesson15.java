import java.util.Scanner;

public class Lesson15 {
    //Написать программу сортировки по возрастанию заданного пользователем массива чисел.
    //Использовать пузырьковый метод сортировки.
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


        for (int i = mas.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (mas[j] > mas[j + 1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }

        System.out.println("Your new mas:");
        for (int m = 0; m < num; m++) {
            System.out.println(m + " element = " + mas[m]);
        }

    }
}
