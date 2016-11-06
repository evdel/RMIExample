package Common;

import java.rmi.Remote;

public interface IGuitar extends Remote{
	public String playString(int stringNumber);
}
