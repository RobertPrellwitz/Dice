package dice;
import java.util.*;

public class test {
	Scanner console = new Scanner(System.in);

    
    public void constructorTest() {
    	Die test1 = new Die();
        Die test2 = new Die(4);
        Die test3 = new Die(12, 20);
        Die test4 = new Die(test3);
        boolean constructor = true;
        
    	
    	System.out.println("This method tests the various constructor methods of the Die Class:");
    	System.out.println("Test 1 - default constructor");
    	System.out.println("test1 number of sides: " +test1.getNumFaces() +"\ntest1 face value: " + test1);
    	 if (test1.getNumFaces() == 6 || test1.getFaceValue() == 6) {  System.out.println("Test Passed\n");}
    	 else
    	 {constructor = false;
    	 System.out.println("Test Failed\n");
    	 }
    	
    	System.out.println("Test 2 - face value overload nubmer 4");
    	System.out.println("test2 number of sides: " +test2.getNumFaces() +"\ntest2 face value: " + test2);
    	if (test2.getNumFaces() == 6 || test2.getFaceValue() == 4) {  System.out.println("Test Passed\n");}
	   	else {constructor = false; System.out.println("Test Failed\n");}
    	
    
    	System.out.println("Test 3 - number of side overload 20 face - value overload nubmer 12");
    	System.out.println("test die 3 has "+test3.getNumFaces() +  " sides!\nand a face value of "
    			+ test3.getFaceValue());
    	if (test3.getNumFaces() == 20 || test3.getFaceValue() == 12) {  System.out.println("Test Passed\n");}
	   	else {constructor = false; System.out.println("Test Failed\n");}
    	
    	System.out.println("test4 Facevalue: " +test4 + "\nTest4 number of sides: " +test4.getNumFaces());
    	
    	String out = (constructor) ? "Constructor tests passed\n" : "Constructor tests failed\n";
    	System.out.println(out);
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
			total = total + sub;
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
    	//Scanner input = new Scanner(System.in);
    	Die die1;
    	System.out.println("Please enter the nubmer of sides on your die.");
    	int sides = Integer.parseInt(console.next());
    	die1 =new Die(sides,sides);
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
    	//input.close();
    }
    
    public void rollCheck() {
    	Die die = new Die();
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
    
    public void customRollCheck() {
    	//Scanner input2 = new Scanner(System.in);
    	Die die1;
    	System.out.println("Please enter the nubmer of sides on your die.");
    	int sides = Integer.parseInt(console.next());
    	die1 = new Die(sides, sides);
    	int [] sideTot = new int [sides];
    	String [] sideName = new String [sides];
    	
    	
    	for (int i=0; i<sides; i++) {
    		sideName[i] = ("side" + (i+1));
    	}
    	
    	for (int i= 0; i <=100; i++) {
    		die1.roll();
    		int roll = die1.getFaceValue();
    		sideTot[roll-1] = sideTot[roll-1]+1;
    	}
    	
    	for (int i = 0; i<sides; i++) {
    		System.out.println(sideName[i] + ": "+ sideTot[i]);
    	}
    	//input2.close();
    }
    
   
}
