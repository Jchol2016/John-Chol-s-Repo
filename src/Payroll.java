package com.myTutorial;

//Non-GUI application to calculate payroll for an employee

import java.io.*; 
import java.text.DecimalFormat; 

public class Payroll {
	// declare class
	public static void main(String[] args) throws IOException {
		//declare variables
		//tempVariable will be used to store information until it can be parsed into strings
		String employeeName, tempVariable; 
		double hourlyRate, hoursWorked, payroll;
		BufferedReader myIn= new BufferedReader(new InputStreamReader(System.in));  //create stream reader

		//get employee name
		System.out.print("Enter the Employee Name:");
		employeeName = myIn.readLine(); // Read input into employee name

		//get hourly rate
		System.out.print("Enter Hourly Rate: ");
		tempVariable = myIn.readLine(); //read string input into the temporary holding area
		hourlyRate = Double.parseDouble(tempVariable); //translate the string into a double so that calculations can be performed

		//get hours worked
		System.out.print("Enter Hours Worked:");
		tempVariable = myIn.readLine();//read string input into the temporary holding area
		hoursWorked = Double.parseDouble(tempVariable);//translate the string into a double

		//calculate the total payroll
		payroll = (double) hourlyRate * hoursWorked;

		DecimalFormat money = new DecimalFormat("$0.00"); //create a format for currency to be displayed properly.

		//display payroll information
		System.out.println("The payroll for " + employeeName + " is " + money.format(payroll));
		

	}
}