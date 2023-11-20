//File Reader Program
import java.io.*;
public class Main {
    public static void main(String[] args) {

        FileReader fr = null;

        try {
            fr = new FileReader("C:\\Users\\장을아이\\Desktop\\JAVA\\InputOutputPart\\src\\helloFile.txt");  // file path
            int c;

            while ((c = fr.read())!= -1) {
                System.out.println((char)c);

            }
            fr.close();
        }catch (IOException e) {
            System.out.println("Here is an error!");
        }
    }
}
