import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server{
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5001);
            System.out.println("Server is running on port 5000...");
            System.out.println("Waiting for a client to connect...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = in.readLine(); 
            System.out.println("Received from client: " + message);

            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}