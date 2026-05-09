import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args){
        try{
            InetAddress inetAddress = InetAddress.getByName("www.google.com");
            System.out.println(inetAddress);
            System.out.println("Host Name: " + inetAddress.getHostName());
            System.out.println("Host Address: " + inetAddress.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
       
    }

    System.out.println("================================");

    try {
        InetAddress[] googleAddresses = InetAddress.getAllByName("www.google.com");
        System.out.println("All IP addresses for www.google.com:");
        for (InetAddress address : googleAddresses) {
            System.out.println(address.getHostAddress());   
        }
    } catch (UnknownHostException e) {
        e.printStackTrace();
    }

    System.out.println("================================");

    try {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("Local Host Name: " + localHost.getHostName());
        System.out.println("Local Host Address: " + localHost.getHostAddress());
    } catch (UnknownHostException e) {
        e.printStackTrace();
    }

    try {
        InetAddress loopbackAddress = InetAddress.getByName("www.kalanasupunmachanyouaregay.com");
        System.out.println("Loopback Host Name: " + loopbackAddress.getHostName());
        System.out.println("Loopback Host Address: " + loopbackAddress.getHostAddress());
    } catch (UnknownHostException e) {
        e.printStackTrace();
    }

    }
}