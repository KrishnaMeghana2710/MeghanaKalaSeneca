package inheritance;

public class multiLevel {
	public static void main(String args[]) {
		child meghana= new child();
		meghana.grand();
		meghana.parents();
		meghana.child();
	}

}
class Grandparents{
	void grand() {
		System.out.println("This is the grandparent class above all");
	}
}
class Parent extends Grandparents{
	void parents() {
		System.out.println("This is the parents class");
	}
}
class child extends Parent{
	void child() {
		System.out.println("This is the child class");
	}
}
