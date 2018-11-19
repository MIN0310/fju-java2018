package com.min;

public class Temperature {

	double Celsius;

	public Temperature(double Celsius) {

		this.Celsius = Celsius;
	}

	public double Fahrenheit() {
		double Fahrenheit = Celsius * (9 / 5.0) + 32;
        return Fahrenheit;
	}
	
}
