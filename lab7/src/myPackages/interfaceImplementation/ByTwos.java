package myPackages.interfaceImplementation;

public class ByTwos implements Series{
	private int start; 
	private int current; 
	
	// default constructor 
	public ByTwos() {
		start = 0; 
		current = 0;
	}
	
	// method to get the next number in the series
	@Override
	public int getNext() {
		current += 2; 
		return current;
	}
	
	// method to reset the series
	public void reset() {
		start = 0; 
		current = 0;
	}
	
	// method to set the starting value
	public void setStart(int x) {
		current = x; 
		start = x;
	}
}
