package com.min;

public class Person {

	float weight;
	float height;
	public Person(float weight, float height){
		this.weight = weight;
		this.height = height;
		
	}

	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	public float bmi() {
		float bmi = weight / (height * height);
		return bmi;

	}

}
