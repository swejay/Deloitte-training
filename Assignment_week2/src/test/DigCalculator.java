package test;
import java.io.*;
abstract class Arithmetic{
	static double num1,num2,output;
	public abstract void Calculate();
	
	Arithmetic()throws IOException	{
		//read();
		this.num1=num1;
		this.num2=num2;
	}
	static void read() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter the operation choice :\n");
		System.out.println("Enter the two numbers : \n");
		num1 =Double.parseDouble(br.readLine());
		num2 =Double.parseDouble(br.readLine());
	}
	public void display(){ //to display the numbers input from the user
		System.out.println("\n The 2 numbers are : "+num1+" , "+num2+"\nResult : "+output);
	}
	
}
class Addition extends Arithmetic{//performs addition
	double n1,n2;
	public Addition() throws IOException{
		super();
	}
	public void Calculate()	{
		output = num1+num2;
	}
}
class Subtraction extends Arithmetic{//performs subtraction
	double n1,n2;
	public Subtraction() throws IOException	{
		super();
	}
	public void Calculate()	{
		output = num1-num2;
	}
}
class Multiplication extends Arithmetic{//performs multiplication
	double n1,n2;
	public Multiplication() throws IOException	{
		super();
	}
	public void Calculate()	{
		output = num1*num2;
	}
}
class Division extends Arithmetic{//performs division
	double n1,n2;
	public Division() throws IOException	{
		super();
	}
	public void Calculate()	{
		try
		{
			output = num1/num2;
		}
		catch(ArithmeticException e)//handles the Arithmetic Exception if the second number is zero
		{
			System.out.println("\nCannot divide by 0");
		}
	}
}
public class DigCalculator{
	static int operand;
	public static void main(String[] args)throws IOException{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nDigital Calculator\n\n Enter your choice of operation : \n");
		operand = Integer.parseInt(br1.readLine());
		Arithmetic operation[] = new Arithmetic[5];
	
		Arithmetic.read();
		operation[1]= (Addition)new Addition();
		operation[2]= (Subtraction)new Subtraction();
		operation[3]= (Multiplication)new Multiplication();
		operation[4]= (Division)new Division();;
		
		operation[operand].Calculate();//calling the function for calculation
		operation[operand].display();//calling the display function
	}
}