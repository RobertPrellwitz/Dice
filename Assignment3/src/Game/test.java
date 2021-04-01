package Game;

public class test {
	

    
    public void dieTest() {
    	Die test = new Die();
        Die test1 = new Die(4);
        Die test3 = new Die(12, 20);
        Die test4 = new Die(test3);
    	
    	System.out.println("This method tests the various constructor methods of the Die Class:");
    	System.out.println("Test 1 - default constructor");
    	System.out.println("test1 number of sides: " +test.getNumFaces() +"\ntest1 face value: " + test);
    	
    	System.out.println("Test 2 - face value overload nubmer 4");
    	System.out.println("test2 number of sides: " +test1.getNumFaces() +"\ntest2 face value: " + test1);
    
    	System.out.println("test3: " +test3);
    	System.out.println("test die 3 has "+test3.getNumFaces()+  " sides!\n and a face value of "
    			+ test3.getFaceValue());
    	System.out.println("test4: " +test4);
    }
    
    public void gameTest() {
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
    }
    
    public void profTest() {
    	Die d1, d2, d3, d4;
    	d1 = new Die();
    	d2 = new Die(2);
    	d3 = new Die(2, 3);
    	d4 = new Die(d3);
    	        
    	System.out.println("d1: " + d1);
    	System.out.println("d2: " + d2);
    	System.out.println("d3: " + d3);
    	System.out.println("d4: " + d4);
    	        
    	d1.setFaceValue(6);
    	System.out.println("d1: " + d1);
    	        
    	System.out.println("d2 Face Value: "+ d2.getFaceValue());
    	System.out.println("d3 Num faces: "+ d3.getNumFaces());
    	        
    	System.out.println("rolling d1");
    	d1.roll();
    	System.out.println("d1: " + d1);
    	        
    	System.out.println("rolling d1");
    	d1.roll();
    	System.out.println("d1: " + d1);
    	        
    	System.out.println("rolling d1");
    	d1.roll();
    	System.out.println("d1: " + d1);
    }
    
    public void sideTest(){
    	Die die1, die2;
    	die1 =new Die(8,8);
    	    	boolean check = true;
    	
    	for (int i= 1; i <= 1000; i++) {
    		die1.roll();
    	    		if (die1.getFaceValue() == 0 || die1.getFaceValue() > die1.getNumFaces()) {
    			check = false;
    			System.out.println("The Die Rolled an invalid number: " + die1.getFaceValue() +
    			" which is outside the range of 1 to " + die1.getNumFaces() + " this failure ocurred on roll " + i +".");
    			break;
    		} 
    		
    	}
    	if (check) { System.out.println("The roll test passed!");
    	}
    }
    
    public void rollCheck() {
    	Die die = new Die(6,6);
    	int side1 = 0, side2 = 0, side3 = 0, side4 = 0, side5 = 0, side6 = 0;
    	for (int i = 0; i <= 100000; i++) {
    		die.roll();
    		int temp = die.getFaceValue();
    		switch(temp) {
    			case (1):
    				side1++;
    				break;
    			case (2):
    				side2++;
    				break;
    			case (3):
    				side3++;
    				break;
    			case (4):
    				side4++;
    				break;
    			case (5):
    				side5++;
    				break;
    			case (6):
    				side6++;
    				break;
    			default:
    				System.out.println("something went wrong - a side value out of context was generated!");
    				
    		}
    		
    	}
    	System.out.println("Side 1 total: "+ side1 +"\nSide 2 total: " + side2 + "\nSide 3 total: " + side3 +"\nSide 4 total: " + side4 + 
				"\nSide 5 total: " + side5 + "\nSide 6 total: " + side6);
    	if(!(side1 > 0) || !(side2 >0) || !(side3 >0) || !(side4 >0) || !(side5 >0) || !(side2 >0)) {
    		System.out.println("there is an error in the roll method.  Look at the sides with no rolls over 10,000 attempts, "
    				+ "to help identify the issue." );
    	}
    }
}
