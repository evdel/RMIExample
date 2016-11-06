package Client;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Logger;
import java.util.logging.Level;

import Common.IGuitar;

public class Program {

	private static final Logger LOGGER = Logger.getLogger("Program");
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Registry registry = LocateRegistry.getRegistry("192.168.1.19");
		LOGGER.log(Level.INFO, "Server registry found");
		
		IGuitar guitar = (IGuitar) registry.lookup("Guitar");
		LOGGER.log(Level.INFO, "registry found");
		
		LOGGER.log(Level.INFO, guitar.playString(0));
	}

}
