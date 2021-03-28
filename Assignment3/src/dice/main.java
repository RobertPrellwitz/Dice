package dice;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hello World!");
		die die1 = new die();
		die die2 = new die();
		
		int die1Tot =0;
		int die2Tot = 0;
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
	}

}
