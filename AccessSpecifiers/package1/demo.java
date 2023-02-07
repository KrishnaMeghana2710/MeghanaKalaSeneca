package packages;

public class demo {
	public static void main(String args[]) {
		demo dm= new demo();
		dm.print2();
	}

    public void print() {
   	 System.out.println("This method is called from another package");
    }
   protected void print1() {
   	System.out.println("This is a protected method and can only be accessed within the package");
   }
   private void print2() {
	   System.out.println("this is a private method and can be accessed only in the class");
   }
   

}
