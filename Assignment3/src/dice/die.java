package dice;

public class die {
	
	// class constants
	private final int DEFAULT_NUM_FACES = 6;
	// class variables
	
	// instance variables
	private int faceValue;
	private int numFaces;
	
	// class methods
	
	
	// instance methods
	public die (int faceValue, int numFaces) {
		this.faceValue = faceValue;
		this.numFaces = numFaces;
		
	}
	
	public die (int faceValue) {
		this.faceValue = faceValue;
		this.numFaces = DEFAULT_NUM_FACES;
	}
	
//	public die () {
//		this(DEFAULT_NUM_FACES, DEFAULT_NUM_FACES);	
//			
//	}
//	
	
	public die () {
		this.faceValue = DEFAULT_NUM_FACES;
		this.numFaces = DEFAULT_NUM_FACES;
	}

	// Copy Constructor
	public die (die die) {
		this.faceValue = die.faceValue;
		this.numFaces = die.numFaces;
	};
	
	//class methods
	public int getFaceValue() {
		return faceValue;
	}
	public int getNumfaces() {
		return numFaces;
	}
	public void setFaceValue(int face) {
		faceValue = face;
	}
	public String toString() {
		return Integer.toString(faceValue);
	}
}
