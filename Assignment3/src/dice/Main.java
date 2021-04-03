/* Robert Prellwitz
 *  * APC 350
 * Assignment 3
 * started 3/29/21
 * completed 4/3/21  
 */

package dice;
//import Game.Fifty;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test tester = new test();
		// constructor test
		tester.constructorTest();
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
