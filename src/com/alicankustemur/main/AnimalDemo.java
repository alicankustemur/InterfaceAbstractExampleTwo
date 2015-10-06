package com.alicankustemur.main;

import com.alicankustemur.animal.IAnimal;
import com.alicankustemur.sampleanimals.Dog;
import com.alicankustemur.sampleanimals.Cat;


public class AnimalDemo {
	public static void main(String[] args){
		
		 final IAnimal myDog = new Dog("Karaba�", 45, 25, "Beyaz",
				    "Kahverengi");
		  myDog.features();
		  myDog.sit();
		  myDog.run();
		  System.out.println(myDog.talk());
				 
		  System.out.println();
				 
		  final IAnimal myCat = new Cat("Minno�", 20, 3, " Gri ", " Ye�il");
		  myCat.features();
		  myCat.sit();
		  myCat.run();
		  System.out.println(myCat.talk());
		 
		  System.out.println();
		 
		  final IAnimal dog = new Dog();
		  dog.features();
		  dog.sit();
		  dog.run();
		  System.out.println(dog.talk());
		 }
		
		
	}

