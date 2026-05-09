import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl extends UnicastRemoteObject implements ServerInterface {

    protected ServerImpl() throws RemoteException {
        super();
    }

    @Override
    public void registerClient(ClientCallback callback) {
        System.out.print("The Client Registered!!!");

        try {
            callback.recieveMessage(
                "Hello Client theis is a callback from the server!!!"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
