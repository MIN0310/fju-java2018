package com.min;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello World");
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
        System.out.println(age);
	}

}
