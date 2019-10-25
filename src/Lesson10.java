import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        int row = 0;
        int col = 0;

        Scanner inputRows = new Scanner(System.in);
        System.out.println("Input amount of rows");
        row = inputRows.nextInt();

        Scanner inputCols = new Scanner(System.in);
        System.out.println("Input amount of cols");
        col = inputCols.nextInt();

        int mas[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Scanner masElement = new Scanner(System.in);
                System.out.println("Input " + i + " " + j + " element");
                mas[i][j] = masElement.nextInt();
            }

        }
        System.out.println("New first row");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(j + " element = " + mas[i][j] * 3);
            }

        }
    }
}
