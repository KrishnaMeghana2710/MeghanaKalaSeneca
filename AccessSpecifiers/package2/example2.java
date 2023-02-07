package packages1;
import packages.demo;


public class example2  extends demo{
public static void main(String args[]) {
	demo dm= new demo();
	dm.print();
	
	//dm.print1();
	// we cannot access this method because it is protected and cannot be accessed outside package 
	// create the present class object and try to access
	
	example2 exp= new example2();
	exp.print1();    // this works
	
	//dm.print2();
	//this is a private method and cannot be accessed outside the class
	
	
}
}
