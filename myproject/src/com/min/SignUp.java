package com.min;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Are you 18? (Y/N)");
		String year = scanner.nextLine();
		System.out.println(year);
		boolean adult = year.equalsIgnoreCase("Y");
		
        System.out.print("You name:");
        String name = scanner.nextLine();
        System.out.println(name);
        
	}

}
