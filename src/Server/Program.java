package Server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import Common.IGuitar;

public class Program {

	public static void main(String[] args) throws Exception{
		IGuitar esp = new Guitar();
		
		IGuitar stub = (IGuitar) UnicastRemoteObject.exportObject(esp, 0);

		Registry registry= LocateRegistry.getRegistry();
		registry.rebind("Guitar", stub);
	}

}
