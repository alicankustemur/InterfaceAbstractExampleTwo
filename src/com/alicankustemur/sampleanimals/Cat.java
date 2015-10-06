package com.alicankustemur.sampleanimals;

import com.alicankustemur.animal.AnimalImpl;

public class Cat extends AnimalImpl {
	 
	public Cat(final String name, final double height, final double weight,
	   final String color, final String eyeColor) {
	  super(name, height, weight, color, eyeColor);
	 }
	 
	public Cat() {
	  super();
	}
	 
	 @Override
	 public String talk() {
	  return "Miyav Miyav";
	 }
	 
}
