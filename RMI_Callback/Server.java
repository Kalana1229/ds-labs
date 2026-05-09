import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) {
        try {
            ServerImpl obj = new ServerImpl();
            Registry registry = LocateRegistry.createRegistry(1100);
            registry.rebind("CallBackService", obj);
            System.out.println("RMI Server running....");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
