import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//Client socket
public class Main {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 3000);
            BufferedReader echoes = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(),true);

            Scanner scanner = new Scanner(System.in);
            String echoString;
            String responses;

            do {
                System.out.println("Enter String to be echoed: ");
                echoString = scanner.nextLine();

                stringToEcho.println(echoString);
                if(!echoString.equals("exit")) {
                    responses = echoes.readLine();
                    System.out.println(responses);
                }
            } while (!echoString.equals("exit"));

        }catch (IOException e) {
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}
