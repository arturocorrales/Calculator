package cse360assign3;

/**
 * Class that adds, subtracts, multiplies, and divides values like a Calculator 
 * https://github.com/arturocorrales/Calculator.git
 * @author Arturo Corrales CSE 360 PIN: 221
 */
public class Calculator {

	private int total;
	private String history = "0";
	
	/** Constructor for Calculator*/
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns total
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds value to total
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts value to total
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * Multiplies value to total
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/**
	 * Divides value to total
	 * @param value
	 */
	public void divide (int value) {
		
		if (value == 0)
			total = 0;
		else
			total = total/value;
		
		history = history + " / " + value;
	}
	
	/**
	 * Returns history
	 * @return
	 */
	public String getHistory () {
		return history;
	}
}