package dice;

import Game.test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test tester = new test();
		// constructor test
		tester.dieTest();
		// professor test
		tester.profTest();
		// verifies that the roll method generates numbers consistent with the number of sides
		tester.sideTest();
		// verifies that the roll method generates output for each side option
		tester.rollCheck();
		// verifies output for each side on user selected number of sides (ie general version of previous)
		tester.customRollCheck();
		// verifies that the simple game option works
		tester.gameTest();
	}

}
