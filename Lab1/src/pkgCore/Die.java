package pkgCore;

public class Die {

	private int DieValue;
	private int dice;

	public  Die() {
		DieValue = (int)((Math.random())*6)+1;
		// get a dice value between 1-6
	}

	public int getDieValue() {
		return DieValue;
	}
}
