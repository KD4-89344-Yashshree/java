package util.Scanner;

import java.util.Scanner;

public class DoubleCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num1=0.0,num2;

		System.out.println("Enter the num1 :");
		if(!sc.hasNextInt()) {
			//
		if(sc.hasNextDouble())
		{
			 num1=sc.nextDouble();
		}
		else 
		{
			System.out.println("You enter something other than double value....");
		}
		//
		
		System.out.println("Enter the num2 :");
		
		if(sc.hasNextDouble())
		{
			 num2=sc.nextDouble();
			 double average=(num1+num2)/2;
		      System.out.printf("The average is: %.2f" ,average);
		}
		
		else 
		{
			System.out.println("You enter something other than double value....");
		}
		}
		else
		System.out.println("Enter the float value ....");

		


		
	}

}
