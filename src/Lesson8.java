public class Lesson8 {

    // Необходимо с помощью цикла вывести на экран числа от 1 до 50.
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (i != 50) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i + ".");
            }
        }
    }
}
