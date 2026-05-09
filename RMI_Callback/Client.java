import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args) {
        try {
            ClientCallbackImpl callbackObj = new ClientCallbackImpl();

            Registry registry = LocateRegistry.getRegistry("localhost", 1100);

            ServerInterface serverInterface = (ServerInterface) registry.lookup(
                "CallBackService"
            );

            serverInterface.registerClient(callbackObj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
