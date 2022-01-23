package com.gl.datastructures;

import java.util.Scanner;

public class DriverStackClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ImplementStackUsingQueues implementStackUsingQueues = new ImplementStackUsingQueues();
		char ch = 0;
		do {
			System.out.println("Stack operations");
			System.out.println("1. Push");
			System.out.println("2. pop");
			System.out.println("3. Check empty");
			System.out.println("4. Size");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to push");
				implementStackUsingQueues.push(scanner.nextInt());
				break;
				
			case 2:
				try {
					System.out.println("Popped element"+ implementStackUsingQueues.pop());
				} catch (Exception e) {
					e.getMessage();
				}
				break;
				
			case 3:
				System.out.println("empty status"+ implementStackUsingQueues.isEmpty());
				break;
				
			case 4: 
				System.out.println("size is "+ implementStackUsingQueues.getSize());
				break;
			default:
				System.out.println("Enter a valid option \n ");
				break;
			}
			implementStackUsingQueues.print();
			System.out.println("Do you want to continue (Type y or n) \n");
			ch = scanner.next().charAt(0);
			

		} while (ch == 'Y' || ch == 'y');
		
		scanner.close();
	}

}
