package com.min;

public class Student {
	String name;
	int english;
	int math;

	public Student(String name, int english, int math) {
		this.name = name;
		this.english = english;
		this.math = math;
	}

	public char print() {
		System.out.print(name + "\t" + english + "\t" + math + "\t" + getAverage() + "\t" + highest() + "\t");

		if ((english + math) / 2 >= 60) {
			System.out.println("PASS");
		} else {
			if ((english + math) / 2 < 60) {
				System.out.println("FAILED");
			}
		}
     int getGrading(){
		int average = getAverage();
		char grading = 'A';
		switch (average / 10) {
		case 10:
		case 9:
			grading = 'A';
			break;
		case 8:
			grading = 'B';
			break;
		case 7:
			grading = 'C';
			break;
		case 6:
			grading = 'D';
			break;
		default:
			grading = 'F';
			
			return grading;
			
		}

		}

	}

	public int highest() {
		if (math > english) {
			return math;
		} else {
			return english;
		}
		
	}

	public int getAverage() {
		return (english + math) / 2;
	}

}