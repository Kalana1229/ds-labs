import java.net.*;
import java.io.*;

public class Sockets {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("google.com", 80);

            System.out.println("Connected!");

            System.out.println("IA: " + socket.getInetAddress());
            System.out.println("Port: " + socket.getPort());
            System.out.println("Local Address: " + socket.getLocalAddress());
            System.out.println("Local Port: " + socket.getLocalPort());
            System.out.println("Input Stream: " + socket.getInputStream());
            System.out.println("Output Stream: " + socket.getOutputStream());

            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            System.out.println("Data read from input stream: " + inputStream.read());

            outputStream.write("GET / HTTP/1.1\r\nHost: google.com\r\n\r\n".getBytes());
            System.out.println("Data written to output stream.");

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}