import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client{
    public static void main(String[] args) {
        try{
            
            // Connect to the RMI registry on the server

            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Look up the remote object
            Hello hello = (Hello) registry.lookup("HelloService");

            String response = hello.sayHello("Alice");
            System.out.println("Response from server: " + response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}