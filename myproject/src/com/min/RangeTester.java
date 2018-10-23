package com.min;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Write a number:");
		int number = scanner.nextInt();
		boolean correct = number >=-3&& number<=5;
		System.out.println(correct);
		
	}

}
