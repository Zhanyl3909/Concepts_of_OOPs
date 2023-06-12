import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.Exception;
public class InputOutput {
    public static void main(String[] args) throws IOException
    {
        String str;
        System.out.println("Type characters in a line and <Enter> key: ");
        System.out.println("An Empty line stops this program: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //wrapping

        while (true) {
            try {
                str = br.readLine();
                if(str.length() == 0) break;
                System.out.println(str);

            } catch (IOException ex) {
                //error handling
            }
        }
        System.out.println("Buy");
    }
}
