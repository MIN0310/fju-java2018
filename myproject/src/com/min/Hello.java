package com.min;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(51.5f, 1.586f);
		// p.weight = 51.5f;
		// p.height = 1.586f;
		System.out.println(p.bmi());
		// Person Jasmine = new Person();
		// Person jack = null;
		// jack.hello();
			
		String name = "Hank";
		int english = 70;
		int math = 90;
		System.out.println( name +"\t"+ english +"\t"+ math +"\t"+(english + math)/2);
		
		
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
