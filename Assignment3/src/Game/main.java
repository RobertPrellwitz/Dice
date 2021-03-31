package Game;

public class main {

	public static void main(String[] args) {
		
		Die die1 = new Die();
		Die die2 = new Die();
		
		int total = 0;
		
		for (int i = 1; i<4; i++) {
			 die1.roll();
			int temp1 = die1.getFaceValue();
			die2.roll();
			int temp2 = die2.getFaceValue();
			int sub = temp1 + temp2;
			total = total +sub;
			System.out.printf("\nRole %d: generated a %d and a %d for a total of %d", i, temp1,temp2, sub);
			
		}
		System.out.println("\nTotal of three tosses is: " + total);
		
		test tester = new test();
		tester.dieTest();
		tester.profTest();
	}

}
