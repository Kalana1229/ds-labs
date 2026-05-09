import java.io.*;
import java.net.Socket;



public class Client{
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5001);
            System.out.println("Connected to server!");
            System.out.println("Sending message to server...");
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello, Server!");
            System.out.println("Message sent to server.");
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}