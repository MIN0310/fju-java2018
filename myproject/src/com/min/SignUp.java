package com.min;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Are you 18? (Y/N)");
		String year = scanner.nextLine();
		System.out.println(year);
		
		System.out.println("*"+ year +"*");
		boolean adult = year.equalsIgnoreCase("Y");
		if(adult){
			System.out.print("Your age:");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Your name:");
			String name = scanner.nextLine();
			System.out.print("Your nick name:");
			String nickName = scanner.nextLine();
			System.out.println(age + "/" + name + "/" + nickName);
			
		}else{
			System.out.println("Thank you for reading it, goodbye!");
		}
       
        
	}

}
