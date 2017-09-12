package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {

		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			int dicevalue = d.getDieValue();
			if (dicevalue < 6 || dicevalue > 1) {
				fail("Die value is" + Integer.toString(dicevalue));
				
				//it fails on purpose so I can see the values :)
			}
			
		}

	}

}
