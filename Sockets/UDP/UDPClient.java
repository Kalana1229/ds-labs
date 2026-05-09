import java.net.*;
import java.io.*;

public class UDPClient{
    public static void main(String[] args){

        try{
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket socket = new DatagramSocket();
        InetAddress ipAddress = InetAddress.getByName("localhost");

        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];

        String sentence = "Hello, UDP Server!";
        sendData = sentence.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipAddress, 9876);
        socket.send(sendPacket);
        System.out.println("Message sent to UDP Server: " + sentence);

        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        socket.receive(receivePacket);
        String modifiedSentence = new String(receivePacket.getData()).trim();
        System.out.println("Message received from UDP Server: " + modifiedSentence);    

        socket.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        

    }
    
}