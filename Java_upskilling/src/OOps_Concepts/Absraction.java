package OOps_Concepts;

abstract class Animal1 {
	abstract void makeSound();

	public void eat() {
		System.out.println("I can eat.");
	}
}

class Dog1 extends Animal1 {

	// provide implementation of abstract method
	public void makeSound() {
		System.out.println("Bark bark");
	}
}

class Absraction {
	public static void main(String[] args) {

		// create an object of Dog class
		Dog1 d1 = new Dog1();

		d1.makeSound();
		d1.eat();
	}
}

