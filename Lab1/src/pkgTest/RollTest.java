package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;
import pkgCore.Roll;

public class RollTest {

	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			int rollvalue = r.getScore();
			if (rollvalue < 12 || rollvalue > 2) {
				fail("Die value is" + Integer.toString(rollvalue));
				//it fails on purpose so I can see the values :)
			}
		}

	}

}
