package com.qa.qacommunity2;

import java.util.Scanner;

public class Menu {
	
	Scanner input = new Scanner(System.in);
	
	public void menu() {
	
	boolean flag = true;
	String option = "";
	int num1;
	int num2;
	
	System.out.println("Welcome to the Calculator app");
	
	while (flag) {
		System.out.println("Please select which operation you want to perform");
		System.out.println("1). Addition");
		System.out.println("2). Subtraction");
		System.out.println("3). Multiplication");
		System.out.println("4). Division");
		System.out.println("0). Exit");
		
	option = this.input.nextLine(); 
		
	switch (option) {
			case "1":
			System.out.println("Please enter the first number");
			num1 = input.nextInt();
			System.out.println("Please enter the second number");
			num2 = input.nextInt();
			input.nextLine();
			System.out.println("The answer is: ");
			System.out.println(CalculatorScanner.add(num1, num2));
			break;
			
			case "2":
				System.out.println("Please enter the first number");
				num1 = input.nextInt();
				System.out.println("Please enter the second number");
				num2 = input.nextInt();
				input.nextLine();
				System.out.println("The answer is: ");
				System.out.println(CalculatorScanner.sub(num1, num2));
				break;
			
			case "3":
				System.out.println("Please enter the first number");
				num1 = input.nextInt();
				System.out.println("Please enter the second number");
				num2 = input.nextInt();
				input.nextLine();
				System.out.println("The answer is: ");
				System.out.println(CalculatorScanner.mul(num1, num2));
				break;
			
			case "4":
				System.out.println("Please enter the first number");
				num1 = input.nextInt();
				System.out.println("Please enter the second number");
				num2 = input.nextInt();
				input.nextLine();
				System.out.println("The answer is: ");
				System.out.println(CalculatorScanner.div(num1, num2));
				break;
				
			case "0":
				flag = false;
				System.out.println("Bye");
				break;
		}
	
		}
	}
}
