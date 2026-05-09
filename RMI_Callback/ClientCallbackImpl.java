import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClientCallbackImpl
    extends UnicastRemoteObject
    implements ClientCallback
{

    protected ClientCallbackImpl() throws RemoteException {
        super();
    }

    @Override
    public void recieveMessage(String message) throws RemoteException {
        System.out.println("Callback from server: ");
        System.out.println(message);
    }
}
