package inheritance;

public class singleInheritance {
	public static void main(String args[]) {
		A a= new A();
		a.print();
		B b= new B();
		b.inherit();
		b.print();
		
	}

}
class A{
	void print() {
		System.out.println("Inside A's Print method");
	}
	void inherit() {
		System.out.println("This is A's method which will be inherited into the sub classes");
	}
	
	
}
class B extends A{
	void print() {
		System.out.println("Inside B's Print method");
	}
	
}

