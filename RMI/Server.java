import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server{
    public static void main(String[] args){
        try{ 
            HelloImpl helloImpl = new HelloImpl();

            Registry registry = LocateRegistry.createRegistry(1099);

            registry.rebind("HelloService", helloImpl);
            System.out.println("Server is ready.");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        


    }
}