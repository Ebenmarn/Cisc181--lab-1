package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.eGameResult;
import pkgCore.Round;
public class Roundtest {

	@Test
	public void TestRound() {

		for (int a = 0; a < 10000; a++) {
			Round r = new Round();
			if (r.GetResult()!=eGameResult.NULL) {
				fail("Roundvalue is"+ r.GetResult()+"  " +r.getRollCount());
				/*it fails on purpose so I can see the values :) it checks for null because
			I set make the round first thing set eGameResult incase something breaks
			
			
				*/
			}
			
		}
		}

	}

 