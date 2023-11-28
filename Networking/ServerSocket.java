import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(3000)) {   //integer (0~65535)
            Socket socket = serverSocket.accept();  //going to block until a client connects to the server
            System.out.println("Client connected");
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            while(true) {
                String echoString = input.readLine();
                if(echoString.equals("exit")) {
                    break;
                }
                output.println("Echo form server: " + echoString);
            }
        } catch (IOException e) {
            System.out.println("Server exception " + e.getMessage());
          //  e.printStackTrace();
        }
    }
}
