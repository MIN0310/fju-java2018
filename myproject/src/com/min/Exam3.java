package com.min;

import java.util.Random;
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {

		Random random = new Random();
		int answer = random.nextInt(10) + 1;
		System.out.println(answer);
		Scanner scanner = new Scanner(System.in);
		System.out.print("You guess : ");

		int max = 10;
		int min = 1;

		while (true) {

			int guess = scanner.nextInt();

			if (guess == answer) {
				System.out.println("Great! The number is " + answer);

			}else{
				if(guess ){
			}
		}

	}

}
