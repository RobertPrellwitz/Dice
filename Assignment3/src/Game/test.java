package Game;

public class test {
	Die test = new Die();
    Die test1 = new Die(8);
    Die test3 = new Die(12, 20);
    Die test4 = new Die(test3);

    
    public void dieTest() {
    	System.out.println("test: " +test);
    	System.out.println("test3: " +test3);
    	System.out.println("test die 3 has "+test3.getNumFaces()+  " sides!\n and a face value of "
    			+ test3.getFaceValue());
    	System.out.println("test4: " +test4);
    	
    	
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
}
