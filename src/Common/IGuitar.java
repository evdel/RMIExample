package Common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IGuitar extends Remote{
	public String playString(int stringNumber) throws RemoteException;
}
