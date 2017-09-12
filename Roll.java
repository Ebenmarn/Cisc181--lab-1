package pkgCore;

public class Roll {

	private Die d1;
	private Die d2;
	private int Score;

	public Roll() {
		d1 = new Die();
		d2 = new Die();
		Score = (d1.getDieValue() + d2.getDieValue());
		//adds the values of d1 and d2
	}

	public int getScore() {
		return Score;
	}

}
