import java.io.*;

public class Lesson17 {
/*    Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
    Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли. Пользователь при тестировании программы
    по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.*/

    public static void main(String[] args) {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input 'стоп' or 'stop' to finish");


        try (FileWriter fw = new FileWriter("test17.txt")) {
            do {
                System.out.println("Input string");
                s = br.readLine();

                if (s.compareTo("stop") == 0 || s.compareTo("стоп") == 0)
                    break;
                s = s + "\r\n";
                fw.write(s);
            }
            while (s.compareTo("stop") != 0 || s.compareTo("стоп") != 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
