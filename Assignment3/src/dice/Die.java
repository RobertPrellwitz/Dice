package dice;

public class Die {
	
	// class constants
	private final int DEFAULT_NUM_FACES = 6;
	// class variables
	
	// instance variables
	private int faceValue;
	private int numFaces;
	
	// instance methods
	//Constructor
	public Die (int faceValue, int numFaces) {
		this.faceValue = faceValue;
		this.numFaces = numFaces;
		
	}
	//constructor
	public Die (int faceValue) {
		this.faceValue = faceValue;
		this.numFaces = DEFAULT_NUM_FACES;
	}
	
//	public die () {
//		this(DEFAULT_NUM_FACES, DEFAULT_NUM_FACES);	
//			
//	}
//	
	// default constructor
	public Die () {
		this.faceValue = DEFAULT_NUM_FACES;
		this.numFaces = DEFAULT_NUM_FACES;
	}

	// Copy Constructor
	public Die (Die die) {
		this.faceValue = die.faceValue;
		this.numFaces = die.numFaces;
	};
	
	//class methods
	public int getFaceValue() {
		return faceValue;
	}
	public int getNumFaces() {
		return numFaces;
	}
	public void setFaceValue(int face) {
		faceValue = face;
	}
	public String toString() {
		return Integer.toString(faceValue);
	}
	public void roll() {
		faceValue = (int) (Math.random()*(numFaces)) + 1;
	}
}
