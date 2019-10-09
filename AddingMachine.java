//Name: Gabriel Gulbranson
//ID: 1212824845
//Course: CSE 360
//Assignment: 2
//Description: Adding Machine does basic ariithmetic operations
//             such as add and substract. Other methods like the toString method
//             returns the history for which methods were used.
//*** github repository url: https://github.com/GabrielCoding98/Assignment2
package cse360assign2;

public class AddingMachine {
	private String history;//string containing the history for arithmetic methods used
	private int total;
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";// initializes the toString() return value to its initial value
	}
	public int getTotal () { //returns the total number after add() or substract()
		return total;
	}
	
	public void add (int value) {
		total+=value;
		history+=(" + " + Integer.toString(value));// adds the string value of the method to the existing string
	}
	
	public void subtract (int value) {
		total-=value;
		history+=(" - " +Integer.toString(value)); // adds arithmetic command to its combined commands
	}
		
	public String toString () {// prints the history of the methods used
		return history;
	}

	public void clear() {// clears the total and the toString() value
	total = 0;
	history="0";
	}
}

