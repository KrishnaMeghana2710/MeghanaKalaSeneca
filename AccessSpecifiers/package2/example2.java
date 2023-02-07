package packages1;
import packages.demo;


public class example2 {
public static void main(String args[]) {
	demo dm= new demo();
	dm.print();
	// dm.print1();
	// we cannot access this method because it is protected and cannot be accessed outside package
	//dm.print2();
	//this is a private method and cannot be accessed outside the class
	
	
}
}
