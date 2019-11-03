import java.io.*;

public class Lesson18 {
/*    Необходимо написать программу, которая будет выводить на экран текстовые данные
    из файла .txt, а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
    Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.*/

    public static void main(String[] args) {
        String s;
        int strNum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("test18.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                strNum++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of strings = " + strNum);

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        try (FileWriter fw = new FileWriter("test18.txt")) {
            for (int i = 1; i <= strNum; i++) {
                System.out.println("Input you string "+ i);
                s = br2.readLine();
                s = s + "\r\n";
                fw.write(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
