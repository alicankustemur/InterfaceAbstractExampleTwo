package com.alicankustemur.animal;

public abstract class AnimalImpl implements IAnimal {
	
	 private String name;
	 private double height;
	 private double weight;
	 private String color;
	 private String eyeColor;
	 

	protected AnimalImpl(final String name, final double height,
			   final double weight, final String color, final String eyeColor) {
			  setName(name);
			  setHeight(height);
			  setWeight(weight);
			  setColor(eyeColor);
			  setEyeColor(eyeColor);
			 }
	
	 protected AnimalImpl() {
		  setName("Ýsimsiz bir hayvan");
		  setHeight(-1);
		  setWeight(-1);
		  setColor("Siyah");
		  setEyeColor("Siyah");
		 }
	
	@Override
	public abstract String talk();

	@Override
	public void sit() {
		System.out.println("Oturuyorum :) ");

	}

	@Override
	public void run() {
		System.out.println("Koþuyorum :) ");

	}

	@Override
	 public void features() {
	  System.out.println("Adý :" + getName());
	  System.out.println("Boyu :" + getHeight() + " cm");
	  System.out.println("Aðýrlýðý :" + getWeight() + " kg");
	  System.out.println("Rengi :" + getColor());
	  System.out.println("Göz Rengi :" + getEyeColor());
	 }
	

	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	

}
