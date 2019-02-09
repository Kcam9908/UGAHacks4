package UGA;
import UGA.CoderMethods;
import java.io.*;

public class CoderDriver {

	public static void main(String[] args) {
		CoderMethods driver = new CoderMethods();
		driver.helloWorld();
		int[] numbers = {1,2,3,4,5};
		driver.addition(numbers, "added");
		driver.subtraction(numbers, "subbed");
		driver.multiply(numbers, "mult");
		driver.printerMethod("mult");
		driver.printerMethod("subbed");
		driver.printerMethod("added");
		driver.varAdd("mult", "added", "combined");
		driver.varSub("mult", "added", "combined1");
		driver.varMult("mult", "added", "combined2");
		driver.varDiv("mult", "added", "combined3");
		driver.printerMethod("combined");
		driver.printerMethod("combined1");
		driver.printerMethod("combined2");
		driver.printerMethod("combined3");
		driver.closer();
		

	}

	
	
}
