package UGA; 
import UGA.CoderMethods;
public class EasyCoder
	{
	CoderMethods c = new CoderMethods();
	public static void main(String[] args)
	{
		System.out.println("Hello, World!");
		int added = 0 + 1 + 2 + 3 + 4 + 5;
		int subbed = 0 - 1 - 2 - 3 - 4 - 5;
		int mult = 1 * 1 * 2 * 3 * 4 * 5;
		System.out.println("The value of the number you created is " +mult);
		System.out.println("The value of the number you created is " +subbed);
		System.out.println("The value of the number you created is " +added);
		int combined = mult + added;
		int combined1 = mult - added;
		int combined2 = mult * added;
		int combined3 = mult / added;
		System.out.println("The value of the number you created is " +combined);
		System.out.println("The value of the number you created is " +combined1);
		System.out.println("The value of the number you created is " +combined2);
		System.out.println("The value of the number you created is " +combined3);
		}
	}
