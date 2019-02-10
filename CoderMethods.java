package UGA;
import java.io.*;

public class CoderMethods {
	
	PrintWriter print;
	int brackets = 2;
	
	File newFile = new File((System.getProperty("user.dir")+"\\src\\UGA\\EasyCoder.java"));
	
	public CoderMethods() 
		{
		try {
			//File newFile = new File("C:\\Workspace2\\UGAHacks4\\src\\UGA\\EasyCoder.java");
			
			print = new PrintWriter(newFile);
			print.print("package UGA; \nimport UGA.CoderMethods;\npublic class EasyCoder\n\t{\n");
			//System.out.print("package UGA; \nimport UGA.CoderMethods;\npublic class EasyCoder\n\t{\n");
			print.println("\tCoderMethods c = new CoderMethods();");
			//System.out.print("\tpublic static void main(String[] args)\n\t{\n");
			print.print("\tpublic static void main(String[] args)\n\t{\n");
		} catch (FileNotFoundException e) {
			 System.out.println("This file does not exist.");
			 System.exit(0);
			}
		}//constructor
	
	
	
	public void helloWorld()
	{
		print.print("\t\tSystem.out.println(\"Hello, World!\");\n");
	}//helloWorld
	
	
	
	public void addition(int[] numbersA, String name)
	{
	String beginning = "int "+name+" = ";
	String expression = "0";
	for(int x : numbersA)
		{
			if(x != 0)
			expression += " + "+Integer.toString(x);
		}
	//System.out.print("\t\t"+beginning + expression+";\n");
	print.print("\t\t"+beginning + expression+";\n");
	}//addition

	
	
	public void subtraction(int[] numbersB, String name)
	{
	String beginning = "int "+name+" = ";
	String expression = "0";
	for(int x : numbersB)
		{
			if(x != 0)
			expression += " - "+Integer.toString(x);
		}
	
	//System.out.print("\t\t"+beginning +expression+";\n");
	print.print("\t\t"+beginning +expression+";\n");
	}//subtraction
	
	
	
	public void multiply(int[] numbersC, String name)
	{
	String beginning = "int "+name+" = ";
	String expression = "1";
	for(int x : numbersC)
		{
			if(x != 1)
			expression += " * "+Integer.toString(x);
		}
	//System.out.print("\t\t"+beginning +expression+";\n");
	print.print("\t\t"+beginning +expression+";\n");
	}//multiply
	
	
	
	/*public void divide(int[] numbersD, String name)
	{
	String beginning = "int "+name+" = ";
	String expression = "1";
	for(int x : numbersD)
		{
			if(x != 0)
				expression += " / "+Integer.toString(x);
			else
				System.out.println("Cannot divide by Zero.");
		}
	//System.out.print("\t\t"+beginning +expression+";\n");
	print.print("\t\t"+beginning +expression+";\n");
	}//divide*/
	
	
	public void closer(){
		{
		int tabs;
		while(brackets > 0)
			{
			tabs = brackets;
			while(tabs > 0)
			{
			print.print("\t");
			tabs--;
			}
			print.print("}\n");
			//System.out.print("}\n");
			brackets--;
			}
		print.close();
		}
	}
	
	
	
	public void varAdd(String var1, String var2, String name)
	{
		print.println("\t\tint "+name+" = "+var1+" + "+var2+";");
	}//varAdd
	
	
	
	public void varSub(String var1, String var2, String name)
	{
		print.println("\t\tint "+name+" = "+var1+" - "+var2+";");
	}//varSub
	
	
	
	public void varMult(String var1, String var2, String name)
	{
		print.println("\t\tint "+name+" = "+var1+" * "+var2+";");
	}//varMult
	
	
	
	public void varDiv(String var1, String var2, String name)
	{
		print.println("\t\tint "+name+" = "+var1+" / "+var2+";");
	}//varDiv
	
	
	
	public void printerMethod(String printed)
	{
		//System.out.println("\"The variable you printed is\"+ "+printed);
		print.println("\t\tSystem.out.println(\"The value of the variable \\\""+printed+"\\\" you created is \" +"+printed+");");
	}//printerMethod

	
	
}//class