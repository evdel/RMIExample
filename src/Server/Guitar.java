package Server;

import Common.IGuitar;

public class Guitar implements IGuitar{

	@Override
	public String playString(int stringNumber) {
		if(stringNumber == 0)
			return "E";
		else return "not E";
	}

}
