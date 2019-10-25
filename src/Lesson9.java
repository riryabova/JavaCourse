import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        int num = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Input amount of elements");
        num = input.nextInt();

        int mas[] = new int[num];
        for (int i=0;i<num;i++){
            Scanner masElement = new Scanner(System.in);
            System.out.println("Input "+i+" element");
            mas[i] = input.nextInt();
        }
        System.out.println("Your new mas:");
        for (int j=0;j<num;j++){
            System.out.println(j+" element = "+mas[j]*2);
        }



    }
}
