package Game;

public class main {

	public static void main(String[] args) {
		
		
		
		test tester = new test();
		// constructor test
		tester.dieTest();
		// professor test
		tester.profTest();
		// verifies that the roll method generates numbers consistent with the number of sides
		tester.sideTest();
		// verifies that the roll method generates output for each side option
		tester.rollCheck();
		// verifies that the simple game option works
		tester.gameTest();
	}

}
