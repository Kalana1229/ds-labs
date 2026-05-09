import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientCallback extends Remote {
    void recieveMessage(String message) throws RemoteException;
}
