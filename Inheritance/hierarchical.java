package inheritance;

public class hierarchical {
	public static void main(String args[]) {
	Dog puppy= new Dog();
	Cat kitten= new Cat();
	puppy.bark();
	puppy.eat();
	kitten.meow();
	kitten.eat();
	}
	
}
class Animal{
	Animal(){
		System.out.println("this is the parent class constructor");
	}
	void eat() {
		System.out.println("Parent eating Method");
	}
}
class Dog extends Animal{
	Dog(){
	super();

	System.out.println("Dog constructor");
	}
	void eat() {
		
		super.eat();
		System.out.println("Dog is eating");
	}
	void bark() {
		System.out.println("Dog is barking");
		
	}
}
class Cat extends Animal{
	Cat(){
		super();
		System.out.println("Cat constructor");
		
	}
	void eat() {
		super.eat();
		System.out.println("Cat is eating");
		
	}
	void meow() {
		
		System.out.println("The cat is meowing");
	}
}
