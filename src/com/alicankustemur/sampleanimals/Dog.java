package com.alicankustemur.sampleanimals;

import com.alicankustemur.animal.AnimalImpl;

public class Dog extends AnimalImpl {
	 
	public Dog(final String name, final double height, final double weight,
	   final String color, final String eyeColor) {
	  super(name, height, weight, color, eyeColor);
	 }
	 
	 public Dog() {
	  super();
	 }
	 
	 @Override
	 public String talk() {
	  return "Hav Hav!";
	 }
}
