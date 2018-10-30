package com.min;

import java.util.Random;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		int s = 1;
		while(s>0){
			System.out.println("AAAA");
			s = s-1;
		}
		
		
		
		Random random = new Random();
		int secret = random.nextInt(100)+1;
		System.out.println(secret);
		
		
		int n = 3/5;
		System.out.println(n);
		int m = 5%3;
		System.out.println(m);
		System.out.printf("number:%.3f  \n", 5.0/3.0);
		int a = 100;
		System.out.printf("You age: %d\n",a);
		
//        double c = 24;
//        System.out.println(c*(9/5.0)+32);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a temperature(C): ");
        double c = scanner.nextDouble();
        double f = c*(9/5.0)+32;
        System.out.printf("%.1f C = %.1f F\n",c,f);
        
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Your name:");
//		String name = scanner.nextLine();
//		System.out.println(name);
		
		
	    Student stu = new Student("Hank", 70, 90);
	    Student min = new Student("Jasmine", 90, 60);
//	    stu.name = "Hank";
//	    stu.english = 70;
//	    stu.math = 90;
	    stu.print();
	    min.print();
	    
	    System.out.println(3 != 5);
	    
	    
		Person p = new Person(51.5f, 1.586f);
		// p.weight = 51.5f;
		// p.height = 1.586f;
		System.out.println(p.bmi());
		// Person Jasmine = new Person();
		// Person jack = null;
		// jack.hello();		
		
			/*System.out.println("Hello World");
	        int age = 18;
	        float height = 1.582f;
	        char weight = 51;
	        short schoolYear = 107;
	        String firstName = "Chia min ";
	        String lastName = "Huang";
	        System.out.println(age);
	        System.out.println(height);
	        System.out.println(weight);		
	        System.out.println(schoolYear);	
	        System.out.print(firstName);
	        System.out.println(lastName);
	        float bmi = weight / (height * height);
	        System.out.println(bmi);
	        age = age + 2;
	        System.out.println(age);*/
	}

}
