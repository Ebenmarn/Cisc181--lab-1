package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	public int rollcount;
	
	//rollcount is used  counts how many rolls

	public Round() {
		Roll RolledValue = new Roll();
		ComeOutScore = RolledValue.getScore();
		eGameResult = pkgCore.eGameResult.NULL;
		//eGameReslut null is to help check if the code works

		if (ComeOutScore == 7 || ComeOutScore == 11) {
			eGameResult = pkgCore.eGameResult.NATURAL;
			//uses the eGameresult list to give out a value
		} 
			else if (ComeOutScore == 12 || ComeOutScore == 2 || ComeOutScore == 3) {
			eGameResult = pkgCore.eGameResult.CRAPS;
		} 
		else {
			
			int i = 0;
			// while loop adding a new dice role and checking if it eqaul to 7 or original roll
			while (i != ComeOutScore || i != 7) {
				Roll NewRoll = new Roll();
				i = NewRoll.getScore();
				rollcount= rollcount + 1;
				
				if (i == 7) {
					eGameResult = pkgCore.eGameResult.SEVEN_OUT;
					break;
				}
				else if (i == ComeOutScore) {
					eGameResult = pkgCore.eGameResult.POINT;
					break;
			}

			}
			}

	}

	public int RollCount() {
		return rollcount;
	}
	public Integer getRollCount() {
		return rollcount; 
		//to see if the roll count is changing
	}

	public pkgCore.eGameResult GetResult() {
		//so we can test the gameresult is changing
		return eGameResult;
	}

}
