package com.fju;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Hello");
    int age = 18;
    float weight = 51.5f;
    int schoolYear = 107;
    float height = 1.582f;
    System.out.println(age);
    System.out.println(weight);
    System.out.println(schoolYear);
    System.out.println(height);
    float bmi = weight / (height * height);
    System.out.println(bmi);
    age = age + 1;
    System.out.println(age);
    
	}

}
