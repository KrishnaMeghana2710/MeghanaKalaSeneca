package inheritance;

public class hierarchical {
	public static void main(String args[]) {
	Dog puppy= new Dog();
	Cat kitten= new Cat();
	puppy.bark();
	puppy.eat();
	
	kitten.meow();
	}
	
	

}
class Animal{
	void eat() {
		System.out.println("Parent eating Method");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog is barking");
		
	}
}
class Cat extends Animal{
	void meow() {
		System.out.println("The cat is meowing");
	}
}
