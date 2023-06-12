import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.Exception;
import java.util.StringTokenizer;

public class InputOutput {
    public static void main(String[] args) throws IOException
    {
        System.out.println("Hello World!");

        char c;
        int i;
        double f;
        String s;

        String str = "";
        System.out.println("Type a char, an integer, a floating num & string <Enter> key: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //wrapping


            try {
                str = br.readLine();

            } catch (IOException ex) {
                //error handling
            }

        StringTokenizer st = new StringTokenizer(str);
        String tmp;
        tmp = st.nextToken();
        c = tmp.charAt(0);

        tmp = st.nextToken();
        i = Integer.parseInt(tmp);

        tmp = st.nextToken();
        f = Float.parseFloat(tmp);

        s = st.nextToken();

        System.out.println("c = " + c);
        System.out.println("i = " + i);
        System.out.println("f = " + f);
        System.out.println("s = " + s);

        br.close();
    }
}
