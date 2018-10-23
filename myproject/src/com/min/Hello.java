package com.min;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your name:");
		String name = scanner.nextLine();
		System.out.println(name);
		
		
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
