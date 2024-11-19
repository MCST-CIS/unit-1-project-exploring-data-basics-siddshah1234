// Siddhant Shah
// Computer Science Programming II
// 11/19/2024
// Project Name: Projected Salary Calculator
// Description: My program, Projected Salary Calculator, calculates an employee’s future salary (monthly and annual) after a specified number of years. It considers factors such as current salary, annual raises, and taxes. My program aims to help employees project their financial growth. 

// importing packages
import java.util.Scanner;
import java.lang.Math;
public class Main
{ 
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		// taking in number of payments per month
		System.out.println("Hello! Please enter the number of payments the employee recieves per month: "); // <-- i/o functionality: printing out 
		int monthlypayments = scanner.nextInt(); // <-- example of data type: int
        //                  ^ example of i/o functionality: taking input from the user using scanner.nextInt()
        
        // taking in amount per paycheck 
		System.out.println("Enter the amount of money the employee recieves per payment: ");
		double paycheckamount = scanner.nextDouble(); // <-- example of data type: double

        // taking in percentage of salary that is taxed
		System.out.println("Enter the percentage of the employee's salary that is taxed: ");
		double taxamount = scanner.nextDouble()/100;

        // taking in average raise amount annually
		System.out.println("What is the employee's annual raise amount as a percentage (on average): ");
		double raiseamount = scanner.nextDouble()/100;
		raiseamount+=1; // <-- example of arithmetic operation manipulating data

        // getting variables for finding final salary and calculating to find current yearly pay before taxes
		double calcsalary;
		double yearly = paycheckamount*monthlypayments*12;
	
        // input to get salary after x amount of years (user inputs x)
		System.out.println("Enter the amount of years you would like to see your salary after: ");
		String years = scanner.next(); // <-- example of data type: string
		
	    // performing calculations to find user salary after x amount of years after taxes
	    // converting string into double
		calcsalary = Double.parseDouble(years); // <-- data manipulation technique using parseDouble function
		// finding how much to multiply the current salary by
		calcsalary = Math.pow(raiseamount, calcsalary); 
		// multiplying the current salary to get the future salary
		calcsalary = yearly*calcsalary;
		// taking away salary for taxes
		calcsalary-=(calcsalary*taxamount);
		// printing out monthly and yearly projected salary of the user
		System.out.print("\nYour salary in " + years + " years will be $" + Math.round(calcsalary/12) + " per month.");
		System.out.print("\nYour salary in " + years + " years will be $" + Math.round(calcsalary) + " per year.");

		

	

	}



}






