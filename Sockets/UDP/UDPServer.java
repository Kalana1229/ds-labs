import java.net.*;
import java.io.*;

public class UDPServer{
    public static void main(String[] args){
        try{
            DatagramSocket serverSocket = new DatagramSocket(9876);
            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[1024];

            while(true){
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                System.out.println("Waiting for a client to send a message...");
                serverSocket.receive(receivePacket);
                String sentence = new String(receivePacket.getData()).trim();
                System.out.println("Message received from client: " + sentence);

                InetAddress clientIPAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                String modifiedSentence = sentence.toUpperCase();
                sendData = modifiedSentence.getBytes();

                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientIPAddress, clientPort);
                serverSocket.send(sendPacket);
                System.out.println("Message sent back to client: " + modifiedSentence);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}