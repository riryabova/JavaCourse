import java.io.*;

public class Lesson16 {
    //   D:\IDEA\Projects
//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
    public static void main(String[] args) {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("test16.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
